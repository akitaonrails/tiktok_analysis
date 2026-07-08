package X;

import Y.AObjectS240S0100000_5;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357890E1j extends AbstractC2255721DQs<InterfaceC358190E2n> implements InterfaceC358190E2n, InterfaceC379610EuV {
    public static final int LLJI = 8;
    public final C1DRG LL;
    public final MutableLiveData<String> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<String> LLILLL = new MutableLiveData<>();
    public final C560530Lyd<ResourceItem> LLILZ = new C560530Lyd<>();
    public final C560530Lyd<Unit> LLILZIL = new C560530Lyd<>();
    public final MutableLiveData<Map<String, List<ResourceItem>>> LLILZLL = new MutableLiveData<>(new LinkedHashMap());
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 458));
    public String LLIZLLLIL = "";
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 457));

    public InterfaceC358190E2n W1() {
        return this;
    }

    private final InterfaceC357900E1k X1() {
        return (InterfaceC357900E1k) this.LLJ.getValue();
    }

    private final C0E48 Z1() {
        return (C0E48) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC358190E2n
    public String RM() {
        Set<String> setKeySet;
        List listLLIIII;
        Map<String, List<ResourceItem>> value = this.LLILZLL.getValue();
        if (value == null || (setKeySet = value.keySet()) == null || (listLLIIII = C13LP.LLIIII(setKeySet)) == null) {
            return null;
        }
        return (String) C13LP.LJJJLZIJ(1, listLLIIII);
    }

    @Override // X.InterfaceC358190E2n
    public void nV() {
        this.LLILZIL.LJIIJ(Unit.LIZ);
    }

    private final void w2() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0EGY c0egy;
        InterfaceC359850E8x interfaceC359850E8xB20;
        C0E48 c0e48Z1 = Z1();
        if (c0e48Z1 == null || (nLETrackSlotLLLLLLIL = c0e48Z1.LLLLLLIL()) == null || (c0egy = (C0EGY) getDiContainer().LJIIL(null, C0EGY.class)) == null || (interfaceC359850E8xB20 = c0egy.B20()) == null) {
            return;
        }
        for (String str : C1697810uHb.LJIIJJI("bottom_item_overlay_edit_filter", "bottom_item_edit_filter")) {
            interfaceC359850E8xB20.LJIIZILJ(str, C353810Dtz.LIZ(nLETrackSlotLLLLLLIL, str), true);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        LiveEvent<EnumC357140DzM> liveEventTI;
        super.onCreate();
        xY0(null);
        this.LLILZLL.setValue(new LinkedHashMap());
        InterfaceC357900E1k interfaceC357900E1kX1 = X1();
        if (interfaceC357900E1kX1 != null && (liveEventTI = interfaceC357900E1kX1.tI()) != null) {
            liveEventTI.LIZ(this, new AObjectS240S0100000_5(this, 73));
        }
        InterfaceC357900E1k interfaceC357900E1kX12 = X1();
        if (interfaceC357900E1kX12 == null || (liveEventEb1 = interfaceC357900E1kX12.eb1()) == null) {
            return;
        }
        liveEventEb1.LIZ(this, new AObjectS240S0100000_5(this, 74));
    }

    @Override // X.InterfaceC358190E2n
    public LiveData<Map<String, List<ResourceItem>>> Ar2() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC358190E2n
    public LiveEvent<Unit> RD1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC358190E2n
    public LiveData<String> gm() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC358190E2n
    public LiveEvent<ResourceItem> nf0() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC358190E2n
    public LiveData<String> xF2() {
        return this.LLILLL;
    }

    public C357890E1j(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void G2(EnumC357140DzM enumC357140DzM) {
        String description;
        String str;
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        C0E48 c0e48Z1 = Z1();
        if (c0e48Z1 != null && (nLEEditorLJI = c0e48Z1.LLFII().LJI()) != null && (branch = nLEEditorLJI.getBranch()) != null && (head = branch.getHead()) != null) {
            description = head.getDescription();
        } else {
            description = null;
        }
        C0E1X c0e1x = (C0E1X) C051R.LIZ(description, C0E1X.class);
        if (c0e1x != null) {
            if (enumC357140DzM == EnumC357140DzM.UNDO) {
                str = c0e1x.LIZIZ;
            } else {
                str = c0e1x.LIZJ;
            }
            this.LLIZLLLIL = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o2(java.util.List<X.C357590E0f> r7) {
        /*
            r6 = this;
            X.0E48 r0 = r6.Z1()
            if (r0 == 0) goto L72
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r0.LLLLLLIL()
            if (r0 == 0) goto L72
            java.lang.String r5 = X.C351220Dpo.LJJJIL(r0)
            r1 = 1
            if (r5 == 0) goto L72
            boolean r0 = kotlin.text.a0.LJJJIL(r5)
            if (r0 != r1) goto L6b
            androidx.lifecycle.LiveData r0 = r6.xF2()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L69
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 != r1) goto L69
            java.util.Iterator r4 = r7.iterator()
        L31:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r3 = r4.next()
            X.0E0f r3 = (X.C357590E0f) r3
            java.util.List<com.ss.ugc.android.editor.base.resource.ResourceItem> r0 = r3.LJI
            if (r0 == 0) goto L31
            java.util.Iterator r2 = r0.iterator()
        L45:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r2.next()
            com.ss.ugc.android.editor.base.resource.ResourceItem r0 = (com.ss.ugc.android.editor.base.resource.ResourceItem) r0
            java.lang.String r1 = r0.getResourceId()
            androidx.lifecycle.LiveData r0 = r6.xF2()
            java.lang.Object r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L45
            java.lang.String r0 = r3.LIZIZ
            r6.k8(r0)
            return
        L69:
            if (r5 == 0) goto L72
        L6b:
            int r0 = r5.length()
            if (r0 <= 0) goto L72
            goto L76
        L72:
            java.lang.String r5 = r6.RM()
        L76:
            r6.k8(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357890E1j.o2(java.util.List):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC358190E2n
    public void Qc0(List<C357590E0f> list) {
        LinkedHashMap linkedHashMap;
        LiveData liveData = this.LLILZLL;
        Map map = (Map) liveData.getValue();
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
            Iterator<C357590E0f> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().LIZIZ;
                if (str != null) {
                    if (linkedHashMap.get(str) == null) {
                        linkedHashMap.put(str, C13BV.INSTANCE);
                    }
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EditorProFilter onResourceCategoriesLoaded ");
                    sbLIZ.append(str);
                    C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } else {
            linkedHashMap = null;
        }
        liveData.setValue(linkedHashMap);
        o2(list);
    }

    @Override // X.InterfaceC358190E2n
    public void So2(EnumC357140DzM enumC357140DzM) {
        NLESegment nLESegment;
        NLEResourceNode resource;
        String extra;
        NLETrackSlot nLETrackSlotLJJZZIII;
        C0E48 c0e48Z1;
        NLETrackSlot nLETrackSlotLJJZZIII2;
        Object next;
        if (enumC357140DzM == EnumC357140DzM.REDO) {
            G2(enumC357140DzM);
        }
        C0E48 c0e48Z12 = Z1();
        String resourceId = null;
        if (c0e48Z12 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48Z12);
            String str = this.LLIZLLLIL;
            Iterator it2 = ((ArrayList) C351220Dpo.LJIIL(nLEModelLJI)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((NLENode) next).getUUID(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            nLESegment = (NLESegment) next;
        } else {
            nLESegment = null;
        }
        if (this.LLIZLLLIL.length() > 0) {
            if (nLESegment != null) {
                extra = nLESegment.getExtra("filter_category");
            } else {
                extra = null;
            }
            k8(extra);
            C0E48 c0e48Z13 = Z1();
            if (c0e48Z13 != null) {
                nLETrackSlotLJJZZIII = C351220Dpo.LJJZZIII(C350870DpF.LJI(c0e48Z13), this.LLIZLLLIL);
            } else {
                nLETrackSlotLJJZZIII = null;
            }
            if (C351220Dpo.LLJ(nLETrackSlotLJJZZIII) && (c0e48Z1 = Z1()) != null) {
                C0E48 c0e48Z14 = Z1();
                if (c0e48Z14 != null) {
                    nLETrackSlotLJJZZIII2 = C351220Dpo.LJJZZIII(C350870DpF.LJI(c0e48Z14), this.LLIZLLLIL);
                } else {
                    nLETrackSlotLJJZZIII2 = null;
                }
                c0e48Z1.S7().LIZIZ(new C358740E4q(nLETrackSlotLJJZZIII2, 0, null, false, 0, 254), "select_slot_event", false);
            }
        }
        if (nLESegment != null && (resource = nLESegment.getResource()) != null) {
            resourceId = resource.getResourceId();
        }
        xY0(resourceId);
    }

    @Override // X.InterfaceC358190E2n
    public void k8(String str) {
        this.LLILLJJLI.setValue(str);
    }

    @Override // X.InterfaceC358190E2n
    public void oF(EnumC357140DzM enumC357140DzM) {
        if (enumC357140DzM == EnumC357140DzM.UNDO) {
            G2(enumC357140DzM);
        }
    }

    @Override // X.InterfaceC358190E2n
    public void wH2(ResourceItem resourceItem) {
        this.LLILZ.LJIIJ(resourceItem);
    }

    @Override // X.InterfaceC358190E2n
    public void xY0(String str) {
        this.LLILLL.setValue(str);
    }

    @Override // X.InterfaceC358190E2n
    public void fl0(String str, List<? extends ResourceItem> list) {
        LinkedHashMap linkedHashMap;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProFilter onResourceItemsLoaded ");
        sbLIZ.append(str);
        sbLIZ.append(" resources ");
        sbLIZ.append(list.size());
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        Map<String, List<ResourceItem>> value = Ar2().getValue();
        if (value != null) {
            linkedHashMap = new LinkedHashMap(value);
            linkedHashMap.put(str, list);
        } else {
            linkedHashMap = null;
        }
        this.LLILZLL.setValue(linkedHashMap);
        w2();
    }
}
