package com.bytedance.android.btm.impl.page.model;

import X.C09R3;
import X.C13LE;
import X.C1554670qYj;
import X.C18CE;
import X.C18CK;
import X.C18CS;
import X.C18E3;
import X.C1972007ny;
import X.C21243718Bn;
import X.C21248718Dl;
import X.C21249818Dw;
import X.C21249918Dx;
import X.C21250018Dy;
import X.C21250118Dz;
import X.C2217371BqR;
import X.C786410Ut5;
import X.EnumC21244218Bs;
import X.EnumC21250718Ef;
import X.EnumC21251218Ek;
import X.InterfaceC1294060jmO;
import X.InterfaceC21247718Db;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.api.cache.ISavable;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class PageInfoStack implements Serializable, ISavable<PageInfoStack> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final C21248718Dl Companion;
    public static final LazyNonNull<InterfaceC21247718Db> pageInfoFactory$delegate;
    public static final long serialVersionUID = 20211213;
    public boolean isContainer;
    public final LazyNonNull nativeState$delegate;
    public PageProp pageProp;
    public final LazyNonNull pageState$delegate;
    public long resumeElapsedRealtime;
    public final LazyNonNull stack$delegate;
    public Boolean userVisibleHint;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(PageInfoStack.class, "stack", "getStack()Ljava/util/concurrent/LinkedBlockingDeque;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(PageInfoStack.class, "nativeState", "getNativeState()Lcom/bytedance/android/btm/api/BtmPageLifecycle$State;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR3 = new C2217371BqR(PageInfoStack.class, "pageState", "getPageState()Lcom/bytedance/android/btm/api/BtmPageLifecycle$State;", 0);
        c09r3.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3};
        Companion = new C21248718Dl();
        pageInfoFactory$delegate = LazyKt.INSTANCE.lazyNonNull(new C21243718Bn());
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getUserVisibleHint$annotations() {
    }

    private final LinkedBlockingDeque<PageInfo> getStack() {
        return (LinkedBlockingDeque) this.stack$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final BtmPageLifecycle.State getNativeState() {
        return (BtmPageLifecycle.State) this.nativeState$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final BtmPageLifecycle.State getPageState() {
        return (BtmPageLifecycle.State) this.pageState$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public String toString() {
        String strSave;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isContainer", this.isContainer);
            jSONObject.put("native_state", getNativeState());
            jSONObject.put("page_state", getPageState());
            PageProp pageProp = this.pageProp;
            if (pageProp == null || (strSave = pageProp.save()) == null) {
                strSave = "{}";
            }
            jSONObject.put("page_prop", strSave);
            jSONObject.put("resume_elapsed_realtime", this.resumeElapsedRealtime);
            JSONArray jSONArray = new JSONArray();
            try {
                Iterator<PageInfo> it2 = getStack().iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next().save());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            jSONObject.put("stack", jSONArray);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public PageInfoStack() {
        LazyKt lazyKt = LazyKt.INSTANCE;
        this.stack$delegate = lazyKt.lazyNonNull(new C21249818Dw());
        this.nativeState$delegate = lazyKt.lazyNonNull(new C21250018Dy());
        this.pageState$delegate = lazyKt.lazyNonNull(new C21250118Dz());
        if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            return;
        }
        setStack(new LinkedBlockingDeque<>());
        BtmPageLifecycle.State state = BtmPageLifecycle.State.INITIALIZED;
        setNativeState(state);
        setPageState(state);
    }

    public final LinkedBlockingDeque<PageInfo> all() {
        return getStack();
    }

    public final PageInfo current() {
        if (!getStack().isEmpty()) {
            return getStack().getLast();
        }
        BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
        bugfixModelLIZIZ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_page_info_stack", Integer.valueOf(bugfixModelLIZIZ.fixPageInfoStack));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : bugfixModelLIZIZ.fixPageInfoStack;
        bugfixModelLIZIZ.fixPageInfoStack = iIntValue;
        if (iIntValue != 1) {
            BcmPageInfo bcmPageInfoLIZ = Companion.LIZ().LIZ();
            getStack().putLast(bcmPageInfoLIZ);
            return bcmPageInfoLIZ;
        }
        synchronized (this) {
            try {
                if (!getStack().isEmpty()) {
                    return getStack().getLast();
                }
                BcmPageInfo bcmPageInfoLIZ2 = Companion.LIZ().LIZ();
                getStack().putLast(bcmPageInfoLIZ2);
                C18CK.LIZJ("PageInfoStack", new C21249918Dx(), false);
                return bcmPageInfoLIZ2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final String getBtmPre() {
        return current().getBtmPre();
    }

    public final boolean isStackEmpty() {
        return getStack().isEmpty();
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public String save() {
        return toString();
    }

    public final PageProp getPageProp() {
        return this.pageProp;
    }

    public final long getResumeElapsedRealtime() {
        return this.resumeElapsedRealtime;
    }

    public final Boolean getUserVisibleHint() {
        return this.userVisibleHint;
    }

    public final boolean isContainer() {
        return this.isContainer;
    }

    private final void setStack(LinkedBlockingDeque<PageInfo> linkedBlockingDeque) {
        this.stack$delegate.setValue(this, $$delegatedProperties[0], linkedBlockingDeque);
    }

    public final boolean contains(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Iterator<PageInfo> it2 = getStack().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getBtmPre(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.btm.api.cache.ISavable
    public PageInfoStack parse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.isContainer = jSONObject.optBoolean("isContainer");
            setNativeState(BtmPageLifecycle.State.valueOf(jSONObject.optString("native_state")));
            setPageState(BtmPageLifecycle.State.valueOf(jSONObject.optString("page_state")));
            PageProp pageProp = new PageProp("", true, false, false, null, false);
            pageProp.parse(jSONObject.optString("page_prop"));
            this.pageProp = pageProp;
            this.resumeElapsedRealtime = jSONObject.optLong("resume_elapsed_realtime");
            LinkedBlockingDeque<PageInfo> linkedBlockingDeque = new LinkedBlockingDeque<>();
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "stack");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    BcmPageInfo bcmPageInfoLIZ = Companion.LIZ().LIZ();
                    bcmPageInfoLIZ.parse(JSONArrayProtectorUtils.getString(jSONArray, i));
                    linkedBlockingDeque.add(bcmPageInfoLIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            setStack(linkedBlockingDeque);
            return this;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C18CE.LIZ.LJFF(1498, "PageInfoStack#parse", null, e, false);
            return this;
        }
    }

    public final void setContainer(boolean z) {
        this.isContainer = z;
    }

    public final void setNativeState(BtmPageLifecycle.State state) {
        this.nativeState$delegate.setValue(this, $$delegatedProperties[1], state);
    }

    public final void setPageProp(PageProp pageProp) {
        this.pageProp = pageProp;
    }

    public final void setPageState(BtmPageLifecycle.State state) {
        this.pageState$delegate.setValue(this, $$delegatedProperties[2], state);
    }

    public final void setRecoveryFrom(EnumC21244218Bs enumC21244218Bs) {
        Iterator<PageInfo> it2 = getStack().iterator();
        while (it2.hasNext()) {
            it2.next().setRecoveryFrom(enumC21244218Bs);
        }
    }

    public final void setResumeElapsedRealtime(long j) {
        this.resumeElapsedRealtime = j;
    }

    public final void setUserVisibleHint(Boolean bool) {
        this.userVisibleHint = bool;
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public /* bridge */ /* synthetic */ PageInfoStack parse(String str) {
        parse(str);
        return this;
    }

    public final void onFEJump(Object obj, String str) {
        boolean auto;
        boolean singleton;
        boolean reuse;
        C18CK.LJIIIZ("PageInfoStack_onFEJump", new C1554670qYj(obj.getClass().getName(), str));
        boolean z = C18E3.LIZ;
        C18E3.LIZLLL(EnumC21251218Ek.HybridJump, this, obj);
        BcmPageInfo bcmPageInfoLIZ = Companion.LIZ().LIZ();
        PageProp pageProp = this.pageProp;
        if (pageProp != null) {
            auto = pageProp.getAuto();
        } else {
            auto = true;
        }
        PageProp pageProp2 = this.pageProp;
        if (pageProp2 != null) {
            singleton = pageProp2.getSingleton();
        } else {
            singleton = false;
        }
        PageProp pageProp3 = this.pageProp;
        if (pageProp3 != null) {
            reuse = pageProp3.getReuse();
        } else {
            reuse = false;
        }
        bcmPageInfoLIZ.setProp(new PageProp(str, auto, singleton, reuse, null, false), obj, this);
        getStack().putLast(bcmPageInfoLIZ);
        C18E3.LJ(obj, this, EnumC21250718Ef.HybridRegister);
    }
}
