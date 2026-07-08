package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360180EAe {
    public static final List<String> LJI = C1697810uHb.LJIIJJI("tt_face", "tt_face_extra");
    public final C365380EUe LIZ;
    public final InterfaceC360230EAj LIZIZ;
    public String LIZJ = "";
    public int LIZLLL;
    public volatile int LJ;
    public long LJFF;

    public final void LIZ() {
        this.LJ++;
        if (this.LJ >= 3) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
            C0EAE c0eae = C0EAE.LIZ;
            Integer numValueOf = Integer.valueOf((int) jCurrentTimeMillis);
            Integer numValueOf2 = Integer.valueOf((this.LIZLLL & 1) >= 1 ? 0 : 1);
            Integer numValueOf3 = Integer.valueOf((this.LIZLLL & 2) >= 1 ? 0 : 1);
            Integer numValueOf4 = Integer.valueOf((this.LIZLLL & 4) >= 1 ? 0 : 1);
            Boolean boolValueOf = Boolean.valueOf(this.LIZLLL != 7);
            c0eae.getClass();
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobLoadRetouchPanel duration = ");
            sbLIZ.append(numValueOf);
            sbLIZ.append(", algModelStatus = ");
            sbLIZ.append(numValueOf2);
            sbLIZ.append(", resListStatus = ");
            sbLIZ.append(numValueOf3);
            sbLIZ.append(", autoRetouchResStatus = ");
            sbLIZ.append(numValueOf4);
            sbLIZ.append(", showErrorUi = ");
            sbLIZ.append(boolValueOf);
            C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            C0LAB c0lab = new C0LAB();
            if (numValueOf != null) {
                c0lab.LIZ(numValueOf.intValue(), "duration");
            }
            if (numValueOf2 != null) {
                c0lab.LIZ(numValueOf2.intValue(), "alg_model_status");
            }
            if (numValueOf3 != null) {
                c0lab.LIZ(numValueOf3.intValue(), "res_list_status");
            }
            if (numValueOf4 != null) {
                c0lab.LIZ(numValueOf4.intValue(), "auto_retouch_res_status");
            }
            if (boolValueOf != null) {
                c0lab.LJFF("show_error_ui", boolValueOf.booleanValue());
            }
            C20684815ws.LJIILLIIL("load_retouch_panel", c0lab.LIZ);
            C354270Duj.LIZJ(0L, new AwS549S0100000_5(this, 1602));
        }
    }

    public final void LIZIZ() {
        C201955140j.LIZIZ("RetouchResourceLoader", "fetchResources start fetchResourceList editor_pro_auto_retouch");
        this.LJFF = System.currentTimeMillis();
        this.LIZ.LJII("editor_pro_auto_retouch", false, false, false, new InterfaceC365520EUs<ResourceItem>() { // from class: X.0EAf
            @Override // X.InterfaceC365520EUs
            public final void onStart() {
            }

            @Override // X.InterfaceC365520EUs
            public final void LIZ(C0EDV c0edv) {
                String message;
                this.LIZ.LIZIZ.LIZIZ();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ.LJFF;
                C0EAE c0eae = C0EAE.LIZ;
                String strValueOf = String.valueOf(c0edv.LIZIZ);
                Exception exc = c0edv.LIZ;
                if (exc != null) {
                    message = exc.getMessage();
                } else {
                    message = null;
                }
                Integer numValueOf = Integer.valueOf((int) jCurrentTimeMillis);
                c0eae.getClass();
                C0EAE.LJIIJJI(strValueOf, 1, numValueOf, 0, message);
                C360180EAe c360180EAe = this.LIZ;
                c360180EAe.LIZLLL &= -5;
                c360180EAe.LIZ();
            }

            @Override // X.InterfaceC365520EUs
            public final void LIZIZ(List<? extends ResourceItem> list, boolean z) {
                String str;
                C360180EAe c360180EAe = this.LIZ;
                ResourceItem resourceItem = (ResourceItem) C13LP.LJJJLL(list);
                if (resourceItem == null || (str = resourceItem.extra) == null) {
                    str = "";
                }
                c360180EAe.LIZJ = str;
                this.LIZ.LIZIZ.LIZ();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ.LJFF;
                C0EAE c0eae = C0EAE.LIZ;
                Integer numValueOf = Integer.valueOf((int) jCurrentTimeMillis);
                Integer numValueOf2 = Integer.valueOf(z ? 1 : 0);
                c0eae.getClass();
                C0EAE.LJIIJJI(null, 0, numValueOf, numValueOf2, null);
                C360180EAe c360180EAe2 = this.LIZ;
                c360180EAe2.LIZLLL |= 4;
                c360180EAe2.LIZ();
            }
        });
        ArrayList arrayList = new ArrayList();
        for (String str : LJI) {
            boolean zIsResourceAvailable = C13Q5.LIZ().LIZLLL().isResourceAvailable(str);
            boolean zLJFF = Intrinsics.LJFF(C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, str), "asset://md5_error");
            if (!zIsResourceAvailable || zLJFF) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            C201955140j.LIZIZ("RetouchResourceLoader", "fetchResources start download models models");
            C13Q5.LIZ().LIZ(new String[]{""}, C2097908Jt.LIZJ(new Pair("models", arrayList)), new C13MA<Long>() { // from class: X.0EAg
                @Override // X.C13MA
                public final void onSuccess(Long l) {
                    l.longValue();
                    C360180EAe c360180EAe = this.LIZ;
                    c360180EAe.LIZLLL |= 1;
                    c360180EAe.LIZ();
                    int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LIZ.LJFF);
                    C0EAE c0eae = C0EAE.LIZ;
                    Integer numValueOf = Integer.valueOf(iCurrentTimeMillis);
                    c0eae.getClass();
                    C0EAE.LJIIIZ(null, 0, numValueOf, 0, null);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(Long l) {
                    l.longValue();
                }

                @Override // X.C13MA
                public final void onFail(Long l, C1662010tLr c1662010tLr) {
                    C360180EAe c360180EAe = this.LIZ;
                    c360180EAe.LIZLLL &= -2;
                    c360180EAe.LIZ();
                    int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LIZ.LJFF);
                    C0EAE c0eae = C0EAE.LIZ;
                    String strValueOf = String.valueOf(c1662010tLr.LIZ);
                    String str2 = c1662010tLr.LIZIZ;
                    Integer numValueOf = Integer.valueOf(iCurrentTimeMillis);
                    c0eae.getClass();
                    C0EAE.LJIIIZ(strValueOf, 1, numValueOf, 0, str2);
                    this.LIZ.LIZIZ.LIZLLL();
                }
            });
            return;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LJFF);
        C0EAE c0eae = C0EAE.LIZ;
        Integer numValueOf = Integer.valueOf(iCurrentTimeMillis);
        c0eae.getClass();
        C0EAE.LJIIIZ(null, 0, numValueOf, 1, null);
        this.LIZLLL |= 2;
        LIZ();
    }

    public C360180EAe(C365380EUe c365380EUe, C0EAC c0eac) {
        this.LIZ = c365380EUe;
        this.LIZIZ = c0eac;
    }
}
