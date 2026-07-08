package X;

import Y.AObserverS209S0100000_5;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS123S0110000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EGH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EGH {
    public final Scene LIZ;
    public final C0E48 LIZIZ;
    public View LIZJ;
    public final C19EG LIZLLL;
    public AwS584S0100000_5 LJ;
    public AwS441S0200000_5 LJFF;
    public AwS584S0100000_5 LJI;
    public AwS584S0100000_5 LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIJ;
    public boolean LJIIL;
    public boolean LJIILJJIL;
    public boolean LJIILLIIL;
    public boolean LJIJ;
    public TTSSpeakerInfo LJIJI;
    public final C0ECE LJIIIZ = new C0FN2() { // from class: X.0ECE
        @Override // X.C0FN2
        public final void LIZ() {
            C0E48 c0e48 = this.LIZ.LIZIZ;
            if (c0e48 != null) {
                c0e48.S7().LIZIZ(Boolean.FALSE, "is_bottom_popup_menu_showing", false);
            }
            View view = this.LIZ.LIZJ;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            if (this.LIZ.LIZLLL().LIZLLL()) {
                this.LIZ.LIZLLL().LIZIZ();
            }
            if (this.LIZ.LJ().LIZLLL()) {
                this.LIZ.LJ().LIZIZ();
            }
            if (((C0FN0) this.LIZ.LJIILL.getValue()).LIZLLL()) {
                ((C0FN0) this.LIZ.LJIILL.getValue()).LIZIZ();
            }
            if (this.LIZ.LIZJ().LIZLLL()) {
                this.LIZ.LIZJ().LIZIZ();
            }
        }

        @Override // X.C0FN2
        public final void onCancel() {
            C0EGH c0egh = this.LIZ;
            if (c0egh.LJIIIIZZ) {
                c0egh.LJIIIIZZ = false;
            } else {
                View view = c0egh.LIZJ;
                if (view != null) {
                    C786410Ut5.T4(view, 1.0f);
                }
            }
            C0E48 c0e48 = this.LIZ.LIZIZ;
            if (c0e48 != null) {
                C350870DpF.LJIIIZ(c0e48, "is_bottom_popup_menu_showing", Boolean.FALSE);
            }
            C355090Dw3.LIZIZ("ActionMenuController", "onCancel");
        }

        @Override // X.C0FN2
        public final void onShow() {
            C0E48 c0e48 = this.LIZ.LIZIZ;
            if (c0e48 != null) {
                C350870DpF.LJIIIZ(c0e48, "is_bottom_popup_menu_showing", Boolean.TRUE);
            }
            C355090Dw3.LIZIZ("ActionMenuController", "onShow");
        }
    };
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1524));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1528));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1527));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1515));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1509));
    public final C01GW LJIJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1507));
    public final C01GW LJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1523));
    public final C01GW LJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1514));
    public final C01GW LJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1526));
    public final C01GW LJJIFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1530));

    public static VideoPublishEditModel LIZIZ() {
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if (editModelProviderLIZIZ != null) {
            return editModelProviderLIZIZ.getEditModel();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII() {
        /*
            X.11VK r1 = X.C11VK.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = LIZIZ()
            if (r0 == 0) goto L20
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L20
            com.ss.android.ugc.aweme.creative.model.PUgcTemplateData r0 = r0.pugcTemplateData
            if (r0 == 0) goto L20
            boolean r0 = r0.isFromCreateTemplate
            r2 = 1
            if (r0 != r2) goto L20
        L15:
            r1.getClass()
            java.lang.String r1 = "editor_pro_sound"
            java.lang.String r0 = "show"
            X.C11VK.LJ(r1, r0, r2)
            return
        L20:
            r2 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EGH.LJII():void");
    }

    public final C0FN0 LIZJ() {
        return (C0FN0) this.LJIIZILJ.getValue();
    }

    public final C0FN0 LIZLLL() {
        return (C0FN0) this.LJIIJJI.getValue();
    }

    public final C0FN0 LJ() {
        return (C0FN0) this.LJIILIIL.getValue();
    }

    public final boolean LJI() {
        return (this.LJIIJ && LIZLLL().LIZLLL()) || (this.LJIILLIIL && LIZJ().LIZLLL()) || ((this.LJIIL && LJ().LIZLLL()) || (this.LJIILJJIL && ((C0FN0) this.LJIILL.getValue()).LIZLLL()));
    }

    public final ArrayList<C0FN1> LJFF(boolean z) {
        VideoPublishEditModel videoPublishEditModelLIZIZ;
        int i;
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        ArrayList<C0FN1> arrayListLJ = C1697810uHb.LJ(new C0FN1(R.raw.icon_text_plus, 2131833412, R.attr.ee, numValueOf, new AwS549S0100000_5(this, 1517), true, 0, null, 0.0f, 16176));
        VideoPublishEditModel videoPublishEditModelLIZIZ2 = LIZIZ();
        if (videoPublishEditModelLIZIZ2 != null && C1403850mdT.LIZ(videoPublishEditModelLIZIZ2) && (videoPublishEditModelLIZIZ = LIZIZ()) != null && u4.LJLJLLL(videoPublishEditModelLIZIZ)) {
            if (C0EJA.LJI()) {
                i = R.raw.icon_color_caption;
            } else {
                i = R.raw.icon_closed_caption_fill;
            }
            if (C0EJA.LJI()) {
                numValueOf = null;
            }
            arrayListLJ.add(new C0FN1(i, 2131826898, R.attr.ee, numValueOf, new AwS123S0110000_5(this, z, 10), z, 0, null, 0.0f, 16176));
        }
        return arrayListLJ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0ECE] */
    public C0EGH(C372480Ej0 c372480Ej0, C0E48 c0e48) {
        MutableLiveData mutableLiveDataLIZ;
        this.LIZ = c372480Ej0;
        this.LIZIZ = c0e48;
        this.LIZLLL = (C19EG) c372480Ej0.requireActivity();
        if (c0e48 != null && (mutableLiveDataLIZ = c0e48.S7().LIZ("event_music_added")) != null) {
            mutableLiveDataLIZ.observe(this.LIZ, new AObserverS209S0100000_5(this, 184));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList<C0FN1> LIZ(boolean z, TTSSpeakerInfo tTSSpeakerInfo) {
        NLEModel nLEModelLJI;
        MusicBuzModel musicBuzModel;
        boolean z2;
        CreativeModel creativeModel;
        int i;
        int i2;
        int i3;
        ArrayList<C0FN1> arrayList = new ArrayList<>();
        VideoPublishEditModel videoPublishEditModelLIZIZ = LIZIZ();
        C0E48 c0e48 = this.LIZIZ;
        Integer numValueOf = null;
        if (c0e48 != null) {
            nLEModelLJI = C350870DpF.LJI(c0e48);
        } else {
            nLEModelLJI = null;
        }
        boolean zLIZ = C349930Dnj.LIZ(videoPublishEditModelLIZIZ, nLEModelLJI, false);
        if (zLIZ || !z) {
            boolean z3 = true;
            if (zLIZ) {
                VideoPublishEditModel videoPublishEditModelLIZIZ2 = LIZIZ();
                if (videoPublishEditModelLIZIZ2 != null && (creativeModel = videoPublishEditModelLIZIZ2.creativeModel) != null) {
                    musicBuzModel = creativeModel.musicBuzModel;
                } else {
                    musicBuzModel = null;
                }
                int i4 = C0EC2.LIZIZ;
                C0EC3 c0ec3LIZIZ = C0EC2.LIZIZ(this.LIZIZ, musicBuzModel);
                if (c0ec3LIZIZ != C0EC3.COUNT_LIMIT && c0ec3LIZIZ != C0EC3.CAN_NOT_BE_STITCHED) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z3 = true ^ z2;
            }
            if (C1458070o2v.LJFF()) {
                if (z3 && C361460EFc.LIZ(LIZIZ())) {
                    arrayList.add(this.LJIJJ.getValue());
                } else {
                    arrayList.add(this.LJIJJLI.getValue());
                }
            } else if (z3) {
                arrayList.add(this.LJIJJ.getValue());
            } else {
                arrayList.add(this.LJIJJLI.getValue());
            }
        }
        if (C1458070o2v.LJFF()) {
            if (z) {
                if (C361460EFc.LIZ(LIZIZ())) {
                    arrayList.add(this.LJIL.getValue());
                } else {
                    arrayList.add(this.LJJ.getValue());
                }
            }
        } else if (z) {
            arrayList.add(this.LJIL.getValue());
        }
        arrayList.add(this.LJJI.getValue());
        C0E48 c0e482 = this.LIZIZ;
        if (c0e482 != null && C346900Diq.LIZ(C350870DpF.LJI(c0e482))) {
            ListProtector.add(arrayList, arrayList.size(), this.LJJIFFI.getValue());
        }
        if (tTSSpeakerInfo != null) {
            if (C0EJA.LJI()) {
                i = R.raw.icon_text_to_speech;
            } else {
                i = R.raw.icon_human_soundwave_fill;
            }
            if (tTSSpeakerInfo.LIZ()) {
                i2 = 2131820776;
            } else {
                i2 = 2131858351;
            }
            Integer numValueOf2 = Integer.valueOf(R.attr.ee);
            AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 1516);
            if (tTSSpeakerInfo.LIZIZ()) {
                tTSSpeakerInfo.LIZ();
            }
            if (tTSSpeakerInfo.LIZIZ()) {
                i3 = R.raw.icon_lock_small;
            } else {
                i3 = -1;
            }
            if (tTSSpeakerInfo.LIZIZ()) {
                numValueOf = Integer.valueOf(R.attr.zk);
            }
            ListProtector.add(arrayList, arrayList.size(), new C0FN1(i, i2, R.attr.ee, numValueOf2, awS549S0100000_5, false, i3, numValueOf, 12.0f, 8880));
        }
        return arrayList;
    }
}
