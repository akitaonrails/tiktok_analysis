package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E0B, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0B {
    public final C0E0G LIZ;
    public final C0E48 LIZIZ;
    public final C0E5S LIZJ;
    public final VideoPublishEditModel LIZLLL;
    public final AsyncTasksPanelViewModel LJ;
    public final C360030E9p LJFF;
    public final Activity LJI;
    public final C0E0N LJII;
    public final InterfaceC355850DxH LJIIIIZZ;
    public NLENode LJIIIZ;
    public String LJIIJ;
    public long LJIIJJI;
    public Pair<? extends ResourceItem, Integer> LJIIL;
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public ResourceItem LJIILLIIL;
    public boolean LJIIZILJ;

    public final void LJIIIZ() {
        NLENode nLENode;
        NLEModel nLEModelDynamicCast;
        C0E48 c0e48 = this.LIZIZ;
        if (c0e48 == null || (nLENode = this.LJIIIZ) == null || (nLEModelDynamicCast = NLEModel.dynamicCast(nLENode)) == null) {
            return;
        }
        c0e48.LLFII().LJI().setModel(nLEModelDynamicCast);
        C350870DpF.LIZ(c0e48, false);
        C0E55 player = c0e48.getPlayer();
        player.LIZIZ(player.Jh());
        String str = this.LJIIJ;
        if (str != null) {
            NLETrackSlot nLETrackSlotLJL = C351220Dpo.LJL(C350870DpF.LJI(c0e48), str);
            this.LJIILL = true;
            c0e48.S7().LIZIZ(new C358740E4q(nLETrackSlotLJL, 1, null, false, 0, 234), "select_slot_event", false);
        }
    }

    public static ArrayList LJI(ResourceItem resourceItem) {
        EnumC356200Dxq enumC356200Dxq;
        ArrayList<String> arrayList = resourceItem.magicResourceTypeList;
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), "photo")) {
                enumC356200Dxq = EnumC356200Dxq.PHOTO;
            } else {
                enumC356200Dxq = EnumC356200Dxq.VIDEO;
            }
            arrayList2.add(enumC356200Dxq);
        }
        return arrayList2;
    }

    public final void LJ(C357640E0k c357640E0k) {
        String str;
        C0E5S c0e5s = this.LIZJ;
        if (c0e5s != null) {
            c0e5s.QD2(true, false);
        }
        C0E0G c0e0g = this.LIZ;
        if (c0e0g != null) {
            c0e0g.Ax0(true);
        }
        LJIIIZ();
        C0E0G c0e0g2 = this.LIZ;
        if (c0e0g2 != null) {
            c0e0g2.Hs();
        }
        c357640E0k.LJIIL();
        c357640E0k.LIZ(AFwS234S0000000_5.get$arr$(161));
        Pair<? extends ResourceItem, Integer> pair = this.LJIIL;
        if (pair != null) {
            C0E0R c0e0r = C0E0R.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
            C0E48 c0e48 = this.LIZIZ;
            ResourceItem first = pair.getFirst();
            int iIntValue = pair.getSecond().intValue();
            c0e0r.getClass();
            C0E0R.LIZIZ(videoPublishEditModel, c0e48, first, iIntValue, "apply_cancel");
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str2 = pair.getFirst().gameplayType;
            if (Intrinsics.LJFF(str2, C0E00.SERVER_GAME_PLAY.getTypeName())) {
                str = "server";
            } else if (Intrinsics.LJFF(str2, C0E00.CLIENT_GAME_PLAY.getTypeName())) {
                str = "client";
            } else {
                str = "combine";
            }
            C361680EFy.LJJLIIIJILLIZJL(2, null, "apply_cancel", jCurrentTimeMillis - this.LJIIJJI, pair.getFirst().getEffectId(), pair.getFirst().getName(), str, "editor_pro", null);
        }
    }

    public final void LJFF(C0E0I c0e0i) {
        C0E5S c0e5s = this.LIZJ;
        if (c0e5s != null) {
            c0e5s.QD2(true, false);
        }
        C0E0G c0e0g = this.LIZ;
        if (c0e0g != null) {
            c0e0g.Ax0(true);
        }
        LJIIIZ();
        c0e0i.LJIIL();
        c0e0i.LIZ(AFwS234S0000000_5.get$arr$(157));
    }

    public final C381540Exc LJII(String str) {
        C0LSZ c0lszLJJII;
        if (C356770Dyl.LIZ()) {
            return this.LJIIIIZZ.LJFF(str);
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ != null && (c0lszLJJII = iCreationAsyncTaskManagerLIZ.LJJII(str)) != null) {
            return C0LSP.LIZIZ(c0lszLJJII);
        }
        return null;
    }

    public final void LJIIIIZZ(ResourceItem resourceItem) {
        NLEEditor nLEEditorLJI;
        String str;
        C0E48 c0e48 = this.LIZIZ;
        if (c0e48 != null) {
            String resourceId = resourceItem.getResourceId();
            C357590E0f category = resourceItem.getCategory();
            if (category != null) {
                str = category.LIZIZ;
            } else {
                str = null;
            }
            c0e48.S7().LIZIZ(new C351380Dq4(resourceId, str, false, 12), "magic_changed_event", false);
        }
        C0E1X c0e1x = new C0E1X(C0E1V.MAGIC.getNameId(), null, null, resourceItem.getName(), null, 22);
        C0E48 c0e482 = this.LIZIZ;
        if (c0e482 != null && (nLEEditorLJI = c0e482.LLFII().LJI()) != null) {
            C350410DoV.LIZLLL(nLEEditorLJI, true, C051R.LIZIZ(c0e1x), false, true);
        }
        C0E0G c0e0g = this.LIZ;
        if (c0e0g != null) {
            c0e0g.yg1();
        }
        Activity activity = this.LJI;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(C786410Ut5.j4(this.LJI.getString(2131836984), Arrays.copyOf(new Object[]{resourceItem.getName()}, 1)));
        creativeToastBuilder.isTuxToast(true);
        C1390380mHk.LIZ(activity, 5012, creativeToastBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C2487209os
            if (r0 == 0) goto L71
            r7 = r11
            X.09os r7 = (X.C2487209os) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r0 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r8 = 2
            r2 = 1
            r5 = 0
            if (r1 == 0) goto L29
            if (r1 == r2) goto L4a
            if (r1 != r8) goto L77
            X.C155000ia.LIZIZ(r0)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.LIZLLL
            if (r4 != 0) goto L33
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            if (r10 != 0) goto L38
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.09or r0 = new X.09or
            r0.<init>(r4, r10, r9, r5)
            r7.LL = r4
            r7.LLILZ = r2
            java.lang.Object r0 = X.C23250099c.LJI(r7, r1, r0)
            if (r0 != r6) goto L4f
            return r6
        L4a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r7.LL
            X.C155000ia.LIZIZ(r0)
        L4f:
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r3 = r0.getFirst()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.getSecond()
            java.lang.String r2 = (java.lang.String) r2
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.09oq r0 = new X.09oq
            r0.<init>(r4, r3, r2, r5)
            r7.LL = r5
            r7.LLILZ = r8
            java.lang.Object r0 = X.C23250099c.LJI(r7, r1, r0)
            if (r0 != r6) goto L26
            return r6
        L71:
            X.09os r7 = new X.09os
            r7.<init>(r9, r11)
            goto L12
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E0B.LJIIJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.05Vn):java.lang.Object");
    }

    public static void LIZ(NLENode nLENode, int i, ResourceItem resourceItem, int i2) {
        nLENode.setExtra("nleExtraEffectSelectedColor", String.valueOf(i));
        nLENode.setExtra("nleExtraEffectKey", resourceItem.getEffectId());
        nLENode.setExtra("nle_extra_resource_id", resourceItem.getResourceId());
        nLENode.setExtra("nleExtraEffectTag", resourceItem.extra);
        nLENode.setExtra("original_effect_name", resourceItem.getName());
        nLENode.setExtra("nleExtraIsEditPro", "true");
        nLENode.setExtra("nleExtraIsFromEditProMagic", "true");
        nLENode.setExtra("nleExtraEffectEntrancePoint", "editor_pro_magic");
        nLENode.setExtra("nleExtraEffectDirectory", resourceItem.getPath());
        nLENode.setExtra("nleExtraEffectIconUrl", resourceItem.getIcon());
        nLENode.setExtra("nleExtraEffectSelectFrom", "magic");
        nLENode.setExtra("nleExtraEffectExtra", resourceItem.extra);
        nLENode.setExtra("nleExtraEffectIndex", String.valueOf(i2));
    }

    public final void LIZIZ(boolean z, ResourceItem resourceItem, int i, InterfaceC497601wk interfaceC497601wk, C0E0I c0e0i) {
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0E0J(this, resourceItem, z, i, c0e0i, interfaceC497601wk, null), 3);
    }

    public final void LIZJ(ResourceItem resourceItem, C354510Dv7 c354510Dv7, int i, C0E0I c0e0i, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, boolean z) {
        String str;
        long maxEnd;
        NLENode nLENodeDeepClone;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrack nLETrackRn;
        String str2 = resourceItem.gameplayType;
        if (Intrinsics.LJFF(str2, C0E00.SERVER_GAME_PLAY.getTypeName())) {
            str = "server";
        } else if (Intrinsics.LJFF(str2, C0E00.CLIENT_GAME_PLAY.getTypeName())) {
            str = "client";
        } else {
            str = "combine";
        }
        C0E48 c0e48 = this.LIZIZ;
        if (c0e48 != null && (nLETrackRn = c0e48.Rn()) != null) {
            maxEnd = nLETrackRn.getMaxEnd();
        } else {
            maxEnd = 0;
        }
        C0E48 c0e482 = this.LIZIZ;
        NLETrackSlot nLETrackSlotDynamicCast = null;
        if (c0e482 != null) {
            nLENodeDeepClone = C350870DpF.LJI(c0e482).deepClone();
        } else {
            nLENodeDeepClone = null;
        }
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone);
        C0E48 c0e483 = this.LIZIZ;
        if (c0e483 != null && (nLETrackSlotLLLLLLIL = c0e483.LLLLLLIL()) != null) {
            nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLLLLLIL.deepClone());
        }
        C0E0A c0e0a = new C0E0A(this, c0e0i, z, c354510Dv7, resourceItem, i, maxEnd, nLEModelDynamicCast, nLETrackSlotDynamicCast, str);
        C0E0G c0e0g = this.LIZ;
        if (c0e0g != null) {
            c0e0g.pr1(c354510Dv7, nLETrackSlot, nLETrackSlot2, c0e0a);
        }
    }

    public C0E0B(C0E0G c0e0g, C0E48 c0e48, C0E5S c0e5s, VideoPublishEditModel videoPublishEditModel, AsyncTasksPanelViewModel asyncTasksPanelViewModel, C360030E9p c360030E9p, Activity activity, C0E0N c0e0n, InterfaceC355850DxH interfaceC355850DxH) {
        this.LIZ = c0e0g;
        this.LIZIZ = c0e48;
        this.LIZJ = c0e5s;
        this.LIZLLL = videoPublishEditModel;
        this.LJ = asyncTasksPanelViewModel;
        this.LJFF = c360030E9p;
        this.LJI = activity;
        this.LJII = c0e0n;
        this.LJIIIIZZ = interfaceC355850DxH;
    }
}
