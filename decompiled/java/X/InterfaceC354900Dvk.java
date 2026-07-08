package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Dvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC354900Dvk {
    boolean LJJJI(EnumC356070Dxd enumC356070Dxd);

    void LJJJJLI();

    boolean LJJJJLL(EnumC356070Dxd enumC356070Dxd);

    void LJJLI(InterfaceC351200Dpm interfaceC351200Dpm);

    boolean LJLLI(EnumC356070Dxd enumC356070Dxd, InterfaceC349350Dmn interfaceC349350Dmn);

    void LJLLJ(C351630DqT c351630DqT, EnumC356070Dxd enumC356070Dxd, NLETrackSlot nLETrackSlot);

    void LLFII(C351600DqQ c351600DqQ, EnumC356070Dxd enumC356070Dxd, Function1<? super NLETrackSlot, Unit> function1);

    Pair<NLETrack, NLETrackSlot> LLIIII(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, boolean z);

    void LLIIZ(boolean z, boolean z2, EnumC356070Dxd enumC356070Dxd);

    boolean LLIL(EnumC356070Dxd enumC356070Dxd);

    EnumC356180Dxo LLILLJJLI(AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, Function2 function2, EnumC356070Dxd enumC356070Dxd, C351590DqP c351590DqP);

    boolean LLILZ(EnumC356070Dxd enumC356070Dxd);

    void LLIZ(NLETrackSlot nLETrackSlot, float f, EnumC356070Dxd enumC356070Dxd);

    float LLIZLLLIL();

    void changeVolume(float f, EnumC356070Dxd enumC356070Dxd);
}
