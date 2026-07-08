package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import njp.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel$postImage$1", f = "LiveQuickPostViewModel.kt", l = {143}, m = "invokeSuspend")
public final class C1444520nh4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LiveQuickPostViewModel LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ Fragment LLILZLL;
    public final /* synthetic */ LiveQuickPostViewModel LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444520nh4(Fragment fragment, LiveQuickPostViewModel liveQuickPostViewModel, String str, int i, String str2, String str3, InterfaceC1364105Vn<? super C1444520nh4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = fragment;
        this.LLIZ = liveQuickPostViewModel;
        this.LLIZLLLIL = str;
        this.LLJ = i;
        this.LLJI = str2;
        this.LLJIJIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1444520nh4 c1444520nh4 = new C1444520nh4(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1444520nh4.LLILZIL = obj;
        return c1444520nh4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Context context;
        boolean z;
        JSONObject jSONObject;
        Fragment fragment;
        LiveQuickPostViewModel liveQuickPostViewModel;
        String str;
        int i;
        String string;
        String string2;
        Resources resources;
        Resources resources2;
        Object objLJI = obj;
        C1C7U.LIZ("LiveQuickPostViewModel@90c1.postImage$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZ;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    i = this.LLILLL;
                    str = (String) this.LLILLJJLI;
                    liveQuickPostViewModel = this.LL;
                    fragment = (Fragment) this.LLILZIL;
                    C155000ia.LIZIZ(objLJI);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJI);
                fragment = this.LLILZLL;
                liveQuickPostViewModel = this.LLIZ;
                str = this.LLIZLLLIL;
                i = this.LLJ;
                C1DFB c1dfb = C0PEM.LIZJ;
                C1444510nh3 c1444510nh3 = new C1444510nh3(liveQuickPostViewModel, null);
                this.LLILZIL = fragment;
                this.LL = liveQuickPostViewModel;
                this.LLILLJJLI = str;
                this.LLILLL = i;
                this.LLILZ = 1;
                objLJI = C23250099c.LJI(this, c1dfb, c1444510nh3);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("LiveQuickPostViewModel@90c1.postImage$1");
                    return objLJFF;
                }
            }
            String str2 = (String) objLJI;
            if (TextUtils.isEmpty(str2)) {
                C1119450fEl.LIZ.getClass();
                C1119450fEl.LIZ(-1, "saveImageToLocal", "image file path is empty", "");
            }
            if (fragment == null || (resources2 = fragment.getResources()) == null || (string = resources2.getString(2131852358)) == null) {
                string = "";
            }
            if (fragment == null || (resources = fragment.getResources()) == null || (string2 = resources.getString(2131852356)) == null) {
                string2 = "";
            }
            C1444460ngy c1444460ngy = liveQuickPostViewModel.LLILLJJLI;
            if (c1444460ngy != null) {
                c098200Yq = Boolean.valueOf(c1444460ngy.LIZJ(i, str, str2, string, string2));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LiveQuickPostViewModel liveQuickPostViewModel2 = this.LLIZ;
        Fragment fragment2 = this.LLILZLL;
        String str3 = this.LLJI;
        String str4 = this.LLJIJIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            if (fragment2 != null) {
                context = fragment2.getContext();
            } else {
                context = null;
            }
            liveQuickPostViewModel2.getClass();
            if (context != null) {
                try {
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        context = null;
                    }
                    if (context != null) {
                        String str5 = (String) ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).Pp2(context, "fan_club_milestone_post_roomid_list", null);
                        if (!TextUtils.isEmpty(str5)) {
                            jSONObject = new JSONObject(str5);
                        } else {
                            jSONObject = new JSONObject();
                        }
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str4);
                        if (jSONArrayOptJSONArray == null) {
                            jSONArrayOptJSONArray = new JSONArray();
                        }
                        int length = jSONArrayOptJSONArray.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            if (TextUtils.equals(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i3), str3)) {
                                jSONArrayOptJSONArray.remove(i3);
                                break;
                            }
                            i3++;
                        }
                        jSONArrayOptJSONArray.put(str3);
                        int length2 = jSONArrayOptJSONArray.length();
                        if (length2 >= 20) {
                            int i4 = (length2 + 1) / 2;
                            for (int i5 = 0; i5 < i4; i5++) {
                                jSONArrayOptJSONArray.remove(0);
                            }
                        }
                        jSONObject.put(str4, jSONArrayOptJSONArray);
                        ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).CM(context, C786410Ut5.J3(jSONObject), "fan_club_milestone_post_roomid_list", null);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1119450fEl c1119450fEl = C1119450fEl.LIZ;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c1119450fEl.getClass();
                    C1119450fEl.LIZ(-1, "saveMileStonePostRoom", message, "");
                }
            }
            liveQuickPostViewModel2.setState(AFwS269S0000000_27.get$arr$(331));
        }
        LiveQuickPostViewModel liveQuickPostViewModel3 = this.LLIZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1119450fEl c1119450fEl2 = C1119450fEl.LIZ;
            String message2 = thM5exceptionOrNullimpl.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            c1119450fEl2.getClass();
            C1119450fEl.LIZ(-1, "postImage", message2, "");
            liveQuickPostViewModel3.setState(AFwS269S0000000_27.get$arr$(332));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveQuickPostViewModel@90c1.postImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
