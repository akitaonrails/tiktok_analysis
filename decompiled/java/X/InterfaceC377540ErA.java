package X;

import android.os.Bundle;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ErA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC377540ErA extends C05YF {
    void B91();

    boolean Bg();

    void Ds();

    LiveEvent<Unit> JY();

    void JZ1();

    C385670FAf<Boolean> LLL();

    boolean LLLLILI(Bundle bundle);

    LiveEvent<Unit> Nd2();

    LiveEvent<Boolean> Pu1();

    void Q70();

    void R11();

    void Tp(boolean z);

    boolean Ux0();

    void Vc0(EditorProCancelData editorProCancelData, EditorProSaveData editorProSaveData, boolean z, boolean z2);

    LiveEvent<Unit> Wz();

    void XL(boolean z, boolean z2);

    void XS0();

    boolean Xc2();

    C0EPN Xv2();

    LiveEvent<Unit> YE1();

    C372830EjZ Yh0();

    InterfaceC377480Er4 b72();

    void bx0(C0ELJ c0elj, boolean z);

    LiveEvent<Unit> fY();

    void g4();

    EnumC376530EpX getSaveType();

    C372180EiW hk2();

    void in1();

    boolean isShowing();

    void nO2();

    LiveEvent<Unit> no2();

    boolean oH();

    LiveEvent<Pair<EnumC377550ErB, Float>> on0();

    void onSaveInstanceState(Bundle bundle);

    void qL0(boolean z);

    LiveEvent<Unit> rD();

    LiveEvent<Boolean> s70();

    AbstractC2217051Bpv tD0(VideoPublishEditModel videoPublishEditModel, boolean z);

    void uj2();

    C385670FAf<C349430Dmv> wL1();

    void yC2();
}
