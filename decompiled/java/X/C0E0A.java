package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.Map;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E0A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0A implements InterfaceC356810Dyp {
    public final /* synthetic */ C0E0B LIZ;
    public final /* synthetic */ C0E0I LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ C354510Dv7 LIZLLL;
    public final /* synthetic */ ResourceItem LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ long LJI;
    public final /* synthetic */ NLEModel LJII;
    public final /* synthetic */ NLETrackSlot LJIIIIZZ;
    public final /* synthetic */ String LJIIIZ;

    @Override // X.InterfaceC356810Dyp
    public final void onStart() {
    }

    @Override // X.InterfaceC356810Dyp
    public final void LIZ(C356900Dyy c356900Dyy) {
        String string;
        Integer numLJIIJJI;
        int iIntValue;
        String str;
        String str2;
        if (!C0FNT.LIZIZ(this.LIZ.LJI)) {
            return;
        }
        this.LIZ.LJFF(this.LIZIZ);
        C0E0R c0e0r = C0E0R.LIZ;
        C0E0B c0e0b = this.LIZ;
        VideoPublishEditModel videoPublishEditModel = c0e0b.LIZLLL;
        C0E48 c0e48 = c0e0b.LIZIZ;
        ResourceItem resourceItem = this.LJ;
        int i = this.LJFF;
        c0e0r.getClass();
        C0E0R.LIZIZ(videoPublishEditModel, c0e48, resourceItem, i, "apply_error");
        C361680EFy.LJJLIIIJILLIZJL(1, Integer.valueOf(c356900Dyy.LIZ), c356900Dyy.LIZIZ, System.currentTimeMillis() - this.LIZ.LJIIJJI, this.LJ.getEffectId(), this.LJ.getName(), this.LJIIIZ, "editor_pro", c356900Dyy.LIZJ);
        Activity activity = this.LIZ.LJI;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        Activity activity2 = this.LIZ.LJI;
        Map<String, String> map = c356900Dyy.LIZJ;
        int i2 = c356900Dyy.LIZ;
        EnumC355970DxT enumC355970DxT = EnumC355970DxT.NO_FACE_ERROR;
        boolean z = false;
        if (i2 == enumC355970DxT.getCode()) {
            string = activity2.getString(2131836985);
        } else if (i2 == EnumC355970DxT.NO_FULL_BODY_ERROR.getCode()) {
            string = activity2.getString(2131836986);
        } else if (i2 == EnumC355970DxT.QUOTA_EXCEED.getCode()) {
            String str3 = map.get("KEY_QUOTA");
            if (str3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) != null && (iIntValue = numLJIIJJI.intValue()) > 0) {
                string = C20642515q3.LJ(2131755752, iIntValue, Integer.valueOf(iIntValue));
            } else {
                string = activity2.getString(2131830089);
            }
        } else if (i2 == EnumC355970DxT.NO_VALID_IMAGE.getCode()) {
            string = activity2.getString(2131850041);
        } else {
            string = activity2.getString(2131830093);
        }
        creativeToastBuilder.message(string);
        creativeToastBuilder.isTuxToast(true);
        C1390380mHk.LIZ(activity, 5012, creativeToastBuilder);
        C0E0B c0e0b2 = this.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = c0e0b2.LIZLLL;
        if (videoPublishEditModel2 != null) {
            ResourceItem resourceItem2 = this.LJ;
            C0E48 c0e482 = c0e0b2.LIZIZ;
            int i3 = c356900Dyy.LIZ;
            if (i3 == enumC355970DxT.getCode()) {
                str = "no_face";
            } else if (i3 == EnumC355970DxT.NO_FULL_BODY_ERROR.getCode()) {
                str = "no_body";
            } else {
                str = "apply_fail";
            }
            C360030E9p c360030E9p = c0e0b2.LJFF;
            if (c360030E9p != null) {
                z = c360030E9p.LLJI;
            }
            String name = resourceItem2.getName();
            String effectId = resourceItem2.getEffectId();
            String resourceId = resourceItem2.getResourceId();
            String strLIZ = C0E0F.LIZ(resourceItem2);
            C357590E0f category = resourceItem2.getCategory();
            if (category != null) {
                str2 = category.LIZIZ;
            } else {
                str2 = null;
            }
            C361680EFy.LJJLIIIJ(videoPublishEditModel2, c0e482, str, z, name, effectId, resourceId, strLIZ, str2);
        }
    }

    @Override // X.InterfaceC356810Dyp
    public final void LIZIZ(C354570DvD c354570DvD) {
        C0E0G c0e0g;
        C354510Dv7 c354510Dv7;
        NLETrackSlot nLETrackSlot;
        String uuid;
        C0E0B c0e0b;
        C0E48 c0e48;
        NLETrackSlot nLETrackSlotLJL;
        if (!C0FNT.LIZIZ(this.LIZ.LJI)) {
            return;
        }
        this.LIZIZ.LIZ(AFwS234S0000000_5.get$arr$(162));
        if (this.LIZJ) {
            C0E5S c0e5s = this.LIZ.LIZJ;
            if (c0e5s != null) {
                c0e5s.QD2(true, false);
            }
            if (!Intrinsics.LJFF(c354570DvD.LIZJ.get("KEY_IS_ASYNC"), "true") && (c354510Dv7 = this.LIZLLL) != null && (nLETrackSlot = c354510Dv7.LJIIJJI) != null && (uuid = nLETrackSlot.getUUID()) != null && (c0e48 = (c0e0b = this.LIZ).LIZIZ) != null && (nLETrackSlotLJL = C351220Dpo.LJL(C350870DpF.LJI(c0e48), uuid)) != null) {
                C0E48 c0e482 = c0e0b.LIZIZ;
                if (c0e482 != null) {
                    C350870DpF.LIZ(c0e482, false);
                }
                C0E48 c0e483 = c0e0b.LIZIZ;
                if (c0e483 != null) {
                    c0e483.S7().LIZIZ(new C358740E4q(nLETrackSlotLJL, 0, null, false, 0, 254), "select_slot_event", false);
                }
            }
            C0E0G c0e0g2 = this.LIZ.LIZ;
            if (c0e0g2 != null) {
                c0e0g2.Ax0(true);
            }
        }
        if (Intrinsics.LJFF(c354570DvD.LIZJ.get("KEY_IS_ASYNC"), "true")) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("apply magic: async: ");
            sbLIZ.append(c354570DvD);
            C201955140j.LIZLLL(c563650M8t, "MagicPanelComponent", C2188811AlT.LIZIZ(sbLIZ));
            C0E5S c0e5s2 = this.LIZ.LIZJ;
            if (c0e5s2 != null) {
                c0e5s2.QD2(true, false);
            }
            C0E0G c0e0g3 = this.LIZ.LIZ;
            if (c0e0g3 != null) {
                c0e0g3.Ax0(true);
            }
            if (!Intrinsics.LJFF(c354570DvD.LIZJ.get("KEY_IS_ASYNC_TASK_FINISH"), "true") && (c0e0g = this.LIZ.LIZ) != null) {
                c0e0g.H32(this.LIZLLL);
            }
            this.LIZIZ.LJIIL();
            this.LIZIZ.LIZLLL(this.LJ);
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0E0C(this, c354570DvD, null), 3);
    }

    @Override // X.InterfaceC356810Dyp
    public final void onProgress(int i) {
        C0E0B c0e0b = this.LIZ;
        C0E0I c0e0i = this.LIZIZ;
        if (C0FNT.LIZIZ(c0e0b.LJI)) {
            C353560Dta c353560Dta = C353560Dta.LIZ;
            VideoPublishEditModel videoPublishEditModel = c0e0b.LIZLLL;
            c353560Dta.getClass();
            if (C353560Dta.LIZLLL(videoPublishEditModel)) {
                c0e0i.LIZ(new AwS20S0001000_5(i, 10));
            } else {
                c0e0i.LIZJ(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C354570DvD r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E0A.LIZJ(X.0DvD, X.05Vn):java.lang.Object");
    }

    public C0E0A(C0E0B c0e0b, C0E0I c0e0i, boolean z, C354510Dv7 c354510Dv7, ResourceItem resourceItem, int i, long j, NLEModel nLEModel, NLETrackSlot nLETrackSlot, String str) {
        this.LIZ = c0e0b;
        this.LIZIZ = c0e0i;
        this.LIZJ = z;
        this.LIZLLL = c354510Dv7;
        this.LJ = resourceItem;
        this.LJFF = i;
        this.LJI = j;
        this.LJII = nLEModel;
        this.LJIIIIZZ = nLETrackSlot;
        this.LJIIIZ = str;
    }
}
