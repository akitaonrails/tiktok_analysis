package X;

import android.content.Context;
import android.graphics.Point;
import android.text.TextWatcher;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0o8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1461660o8i extends C05YF {
    C122Q B02();

    Pair<Float, Float> Cc(Context context);

    void Ct(TextStickerData textStickerData, boolean z);

    void D6(EnumC390580FTc enumC390580FTc, Function1<? super StickerModel, Boolean> function1);

    void Dv1(boolean z);

    List<TextStickerData> Et0();

    InterfaceC1444160ngU LJJIFFI();

    void LJJJJJ(int i);

    boolean LJJJLZIJ();

    boolean LJLL();

    Point LLFZ();

    void LLJJIJIL();

    void LLLLJ();

    void OJ2(boolean z);

    void R3(boolean z);

    void T1();

    void U4();

    void W62(float f, boolean z, Function1<? super StickerModel, Boolean> function1);

    void Wf();

    void X3(TextWatcher textWatcher);

    void Yr();

    void ad(List<Integer> list);

    boolean c0();

    void i7(InfoStickerModel infoStickerModel);

    C0FVT kR();

    boolean lK1();

    List<TextStickerData> lr0();

    ArrayList<TextStickerData> qT1();

    C385670FAf<Boolean> s8();

    void xr(String str, C388340FKm c388340FKm, Function1<? super StickerModel, Unit> function1);

    void yH1(float f, boolean z);
}
