package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ej4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372520Ej4 {
    public final InterfaceC372510Ej3 LIZ;
    public final C372500Ej2 LIZIZ;
    public final C372350Ein LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public final void LIZJ() {
        C786410Ut5.LJLLLLLL(0, this.LIZ.Wq());
        C372830EjZ c372830EjZXj = this.LIZ.xj();
        if (c372830EjZXj != null) {
            c372830EjZXj.setDraggable(true);
        }
        this.LIZ.Zq().LJII(Boolean.TRUE);
        InterfaceC359950E9h interfaceC359950E9hQr = this.LIZ.qr();
        if (interfaceC359950E9hQr != null) {
            interfaceC359950E9hQr.dl2();
        }
        this.LIZJ.LJ.invoke();
    }

    public final boolean LIZLLL() {
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0ELJ c0elj;
        VideoPublishEditModel editModel;
        C0EY2 c0ey2Ar = this.LIZ.ar();
        if (c0ey2Ar == null || (liveDataZu2 = c0ey2Ar.zu2()) == null || (value = liveDataZu2.getValue()) == null || (c0elj = value.LJ) == null || (editModel = this.LIZ.getEditModel()) == null) {
            return false;
        }
        if (!c0elj.isLaunchEditorProFromScheme() && !Intrinsics.LJFF(c0elj.getEnterFrom(), "enter_from_album_editor_pro_entrance")) {
            C363500EMy.LIZ.getClass();
            if (!C363500EMy.LJIIJ(editModel)) {
                return false;
            }
        }
        return true;
    }

    public final void LJII() {
        InterfaceC372610EjD interfaceC372610EjDLr;
        if (this.LIZ.Bg() || (interfaceC372610EjDLr = this.LIZ.lr()) == null) {
            return;
        }
        interfaceC372610EjDLr.FP2(new C372660EjI(this), new C372590EjB(this));
    }

    public final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0ELJ c0elj;
        C0EY2 c0ey2Ar = this.LIZ.ar();
        if ((c0ey2Ar == null || (liveDataZu2 = c0ey2Ar.zu2()) == null || (value = liveDataZu2.getValue()) == null || (c0elj = value.LJ) == null || !c0elj.getEffectMultiTrackMode()) && C365940EWi.LIZ(videoPublishEditModel) && (videoPublishEditModel == null || !videoPublishEditModel.creativeModel.draftInfoModel.isDraft)) {
            return true;
        }
        return false;
    }

    public final void LJFF(boolean z) {
        InterfaceC350420DoW interfaceC350420DoWBs;
        ArrayList<C0E9K> arrayList;
        this.LIZ.hr();
        C0E48 c0e48LIZIZ = this.LIZ.LIZIZ();
        if (c0e48LIZIZ != null) {
            Boolean bool = Boolean.FALSE;
            c0e48LIZIZ.S7().LIZIZ(bool, "has_shown_bottom_menu_anim_guide", false);
            c0e48LIZIZ.S7().LIZIZ(bool, "event_user_guide_intercepted", false);
            this.LJ = false;
        }
        this.LIZ.sr();
        this.LIZ.gr();
        C0E5X c0e5x = C0E5X.LIZ;
        String strDr = this.LIZ.dr();
        if (strDr != null) {
            ConcurrentHashMap<String, ArrayList<C0E9K>> concurrentHashMap = C0E5X.LIZIZ;
            if (concurrentHashMap.containsKey(strDr) && (arrayList = concurrentHashMap.get(strDr)) != null) {
                Iterator<C0E9K> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
            }
        }
        C0E48 c0e48LIZIZ2 = this.LIZ.LIZIZ();
        if (c0e48LIZIZ2 != null && (interfaceC350420DoWBs = c0e48LIZIZ2.bs()) != null) {
            C350440DoY.LIZIZ(interfaceC350420DoWBs);
        }
    }

    public final void LJI(Boolean bool) {
        this.LJI = true;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            this.LIZJ.LJIIZILJ.invoke();
        } else {
            this.LIZJ.LJI.invoke();
        }
    }

    public final boolean LJIIIIZZ(Boolean bool) {
        boolean continueSelected;
        CreativeModel creativeModel;
        AudioCopyrightDetectModel audioCopyrightDetectModel;
        if (this.LIZ.Bg()) {
            return false;
        }
        this.LIZJ.LJIILLIIL.invoke();
        InterfaceC1453760nvy interfaceC1453760nvyBr = this.LIZ.br();
        if (interfaceC1453760nvyBr != null) {
            VideoPublishEditModel editModel = this.LIZ.getEditModel();
            if (editModel != null && (creativeModel = editModel.creativeModel) != null && (audioCopyrightDetectModel = creativeModel.audioCopyrightDetectModel) != null) {
                continueSelected = audioCopyrightDetectModel.getContinueSelected();
            } else {
                continueSelected = false;
            }
            if (interfaceC1453760nvyBr.KB2("video_edit_page", "click_edit_page_next", !continueSelected, null, new AwS406S0200000_5(this, bool, 87))) {
                return false;
            }
        }
        InterfaceC372610EjD interfaceC372610EjDLr = this.LIZ.lr();
        if (interfaceC372610EjDLr == null) {
            return false;
        }
        return interfaceC372610EjDLr.jl0(new AwS406S0200000_5(this, bool, 88), new C372600EjC(this));
    }

    public final void LIZ(boolean z, boolean z2) {
        LJ(z, z2, true);
        InterfaceC372610EjD interfaceC372610EjDLr = this.LIZ.lr();
        if (interfaceC372610EjDLr != null) {
            interfaceC372610EjDLr.Xd0();
        }
    }

    public C372520Ej4(C372480Ej0 c372480Ej0, C372500Ej2 c372500Ej2, C372350Ein c372350Ein) {
        this.LIZ = c372480Ej0;
        this.LIZIZ = c372500Ej2;
        this.LIZJ = c372350Ein;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372520Ej4.LJ(boolean, boolean, boolean):void");
    }
}
