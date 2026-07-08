package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357810E1b extends C0E96 {
    public final InterfaceC357820E1c LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final List<String> LLJILJIL;

    public final void LJIILIIL() {
        MutableLiveData<C357800E1a> mutableLiveDataDx1;
        MutableLiveData<C357800E1a> mutableLiveDataDx12;
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
            C0E48 c0e48LJIIJ = LJIIJ();
            if (c0e48LJIIJ == null) {
                return;
            }
            long jLJII = C351220Dpo.LJII(C350870DpF.LJI(c0e48LJIIJ));
            int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.IMPORT_LIMIT, 100)).intValue();
            C0E48 c0e48LJIIJ2 = LJIIJ();
            if ((jLJII - ((c0e48LJIIJ2 != null ? c0e48LJIIJ2.getPlayer().Jh() : 0L) * 1000)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < iIntValue) {
                Activity activityLJIIIZ = LJIIIZ();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131827574);
                C1390380mHk.LIZ(activityLJIIIZ, 6007, creativeToastBuilder);
                return;
            }
        }
        InterfaceC357820E1c interfaceC357820E1c = this.LLIZLLLIL;
        if (interfaceC357820E1c != null && (mutableLiveDataDx12 = interfaceC357820E1c.Dx1()) != null) {
            mutableLiveDataDx12.postValue(new C357800E1a(C0E1Y.ADD_STICKER));
        }
        InterfaceC357820E1c interfaceC357820E1c2 = this.LLIZLLLIL;
        String.valueOf((interfaceC357820E1c2 == null || (mutableLiveDataDx1 = interfaceC357820E1c2.Dx1()) == null) ? null : mutableLiveDataDx1.getValue());
    }

    public final VideoPublishEditModel LJIILJJIL() {
        return (VideoPublishEditModel) this.LLJIJIL.getValue();
    }

    @Override // X.C0EHG
    public final boolean LJ(C361980EHc c361980EHc) {
        return this.LLJILJIL.contains(c361980EHc.LJI);
    }

    @Override // X.C0E96, X.C0EHG
    public final boolean LJII(C361980EHc c361980EHc) {
        if (TextUtils.equals(c361980EHc.LJI, "bottom_item_root_sticker")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C0EHG
    public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
        MutableLiveData<C357800E1a> mutableLiveDataDx1;
        MutableLiveData<C357800E1a> mutableLiveDataDx12;
        LiveData<C0E75> liveDataDQ;
        C0E75 value;
        C0E5S c0e5s;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        MutableLiveData<C357800E1a> mutableLiveDataDx13;
        C0E55 player;
        if (!c361980EHc.LJII) {
        }
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ != null && (player = c0e48LJIIJ.getPlayer()) != null) {
            player.pause(false);
        }
        String str = c361980EHc.LJI;
        switch (str.hashCode()) {
            case -1782817787:
                if (str.equals("bottom_item_sticker_add_sticker")) {
                    LJIILIIL();
                    VideoPublishEditModel videoPublishEditModelLJIILJJIL = LJIILJJIL();
                    if (videoPublishEditModelLJIILJJIL != null) {
                        C361680EFy.LJJJI("add", videoPublishEditModelLJIILJJIL, LJIIJ(), null, false, false, null, null, 1016);
                    }
                }
                break;
            case -1574812199:
                if (str.equals("bottom_item_sticker_edit_replace")) {
                    VideoPublishEditModel videoPublishEditModelLJIILJJIL2 = LJIILJJIL();
                    if (videoPublishEditModelLJIILJJIL2 != null) {
                        C361680EFy.LJJJI("replace", videoPublishEditModelLJIILJJIL2, LJIIJ(), null, false, false, null, null, 1016);
                    }
                    InterfaceC357820E1c interfaceC357820E1c = this.LLIZLLLIL;
                    if (interfaceC357820E1c != null && (mutableLiveDataDx1 = interfaceC357820E1c.Dx1()) != null) {
                        mutableLiveDataDx1.postValue(new C357800E1a(C0E1Y.REPLACE_STICKER));
                        break;
                    }
                }
                break;
            case -553814416:
                if (str.equals("bottom_item_sticker_edit_copy")) {
                    VideoPublishEditModel videoPublishEditModelLJIILJJIL3 = LJIILJJIL();
                    if (videoPublishEditModelLJIILJJIL3 != null) {
                        C361680EFy.LJJJI("copy", videoPublishEditModelLJIILJJIL3, LJIIJ(), null, false, false, null, null, 1016);
                    }
                    InterfaceC357820E1c interfaceC357820E1c2 = this.LLIZLLLIL;
                    if (interfaceC357820E1c2 != null && (mutableLiveDataDx12 = interfaceC357820E1c2.Dx1()) != null) {
                        mutableLiveDataDx12.postValue(new C357800E1a(C0E1Y.COPY_STICKER));
                        break;
                    }
                }
                break;
            case -515611784:
                if (str.equals("bottom_item_root_sticker") && view != null) {
                    C0E5S c0e5s2 = (C0E5S) this.LLJ.getValue();
                    if (c0e5s2 != null && (liveDataDQ = c0e5s2.dQ()) != null && (value = liveDataDQ.getValue()) != null && value.LIZJ != null && (c0e5s = (C0E5S) this.LLJ.getValue()) != null) {
                        c0e5s.w6(null, false, false);
                    }
                    LJIILIIL();
                    VideoPublishEditModel videoPublishEditModelLJIILJJIL4 = LJIILJJIL();
                    if (videoPublishEditModelLJIILJJIL4 != null) {
                        C361680EFy.LJJJI("add", videoPublishEditModelLJIILJJIL4, LJIIJ(), null, false, false, null, null, 1016);
                    }
                    break;
                }
                break;
            case 26424191:
                if (str.equals("bottom_item_sticker_edit_split")) {
                    C0E48 c0e48LJIIJ2 = LJIIJ();
                    if (c0e48LJIIJ2 != null && (nLETrackSlotLLLLLLIL = c0e48LJIIJ2.LLLLLLIL()) != null) {
                        nLETrackSlotLLLLLLIL.setExtra("is_editor_pro_split_used", "true");
                    }
                    C0E48 c0e48LJIIJ3 = LJIIJ();
                    if (c0e48LJIIJ3 != null) {
                        c0e48LJIIJ3.getPlayer().pause(false);
                        int i = C349360Dmo.LIZJ;
                        C350670Dov.LIZJ(c0e48LJIIJ3, EnumC356070Dxd.DONE, null, null, null, true);
                    }
                    InterfaceC363820EOe interfaceC363820EOe = (InterfaceC363820EOe) this.LLJI.getValue();
                    if (interfaceC363820EOe != null) {
                        interfaceC363820EOe.L51(null);
                    }
                    VideoPublishEditModel videoPublishEditModelLJIILJJIL5 = LJIILJJIL();
                    if (videoPublishEditModelLJIILJJIL5 != null) {
                        C361680EFy.LJJJI("split", videoPublishEditModelLJIILJJIL5, LJIIJ(), null, false, false, null, null, 1016);
                    }
                }
                break;
            case 379550182:
                if (str.equals("bottom_item_sticker_edit_delete")) {
                    VideoPublishEditModel videoPublishEditModelLJIILJJIL6 = LJIILJJIL();
                    if (videoPublishEditModelLJIILJJIL6 != null) {
                        C361680EFy.LJJJI("delete", videoPublishEditModelLJIILJJIL6, LJIIJ(), null, false, false, null, null, 1016);
                    }
                    InterfaceC357820E1c interfaceC357820E1c3 = this.LLIZLLLIL;
                    if (interfaceC357820E1c3 != null && (mutableLiveDataDx13 = interfaceC357820E1c3.Dx1()) != null) {
                        mutableLiveDataDx13.postValue(new C357800E1a(C0E1Y.DELETE_STICKER));
                        break;
                    }
                }
                break;
        }
    }

    public C357810E1b(C19A3 c19a3, C1DRG c1drg, C0EGH c0egh, InterfaceC357820E1c interfaceC357820E1c) {
        super(c19a3, c1drg, R.id.gcw);
        this.LLIZLLLIL = interfaceC357820E1c;
        this.LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(c1drg, 1559));
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(c1drg, 1557));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(395));
        c0egh.LJI = new AwS584S0100000_5(this, 1101);
        this.LLJILJIL = C1697810uHb.LJIILJJIL("bottom_item_root_sticker", "bottom_item_sticker_add_sticker", "bottom_item_sticker_edit_split", "bottom_item_sticker_edit_replace", "bottom_item_sticker_edit_copy", "bottom_item_sticker_edit_delete");
    }
}
