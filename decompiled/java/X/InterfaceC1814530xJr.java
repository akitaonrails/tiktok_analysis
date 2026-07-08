package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1814530xJr {
    void LIZ(DataChannel dataChannel);

    void LIZIZ(Board board, C1814120xJC c1814120xJC);

    void LIZJ(C1776890wL9 c1776890wL9, float f);

    void LIZLLL(InterfaceC1776570wKd interfaceC1776570wKd, BoardItemPosition boardItemPosition, C1814560xJu c1814560xJu);

    Long LJ();

    void LJFF(Context context, BoardItem boardItem, HashMap<String, String> map);

    void LJI(Board board, HashMap map);

    void LJII(Context context, Board board, HashMap map);

    void LJIIIIZZ(Board board, HashMap<String, String> map);

    void LJIIIZ(Board board, boolean z, Function1<? super Boolean, Unit> function1, HashMap<String, String> map);

    void LJIIJ(InterfaceC1815550xLV interfaceC1815550xLV, BoardItem boardItem);

    void LJIIJJI();

    AnonymousClass0951 LJIIL();

    void LJIILIIL();

    void LJIILJJIL(InterfaceC1776570wKd interfaceC1776570wKd);

    void LJIILL(Board board);

    void release();
}
