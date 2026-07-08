package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessRoundDurationChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWordlistResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0JFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488910JFh {
    public static final C01GW LIZ = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(372));
    public static DataChannel LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static DrawGuessWord LJ;

    public static void LIZJ() {
        LIZJ = true;
        ((DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class)).getWordList(C500260Jjc.LJJLIIIJ(LIZIZ)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0JFi
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DrawGuessWordListUtil@8b8a.requestWordList$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                ((ArrayList) C488910JFh.LIZ.getValue()).addAll(((DrawGuessWordlistResponse) baseResponse.data).wordList);
                C488910JFh.LIZJ = false;
                DataChannel dataChannel = C488910JFh.LIZIZ;
                if (dataChannel != null) {
                    dataChannel.zW(DrawGuessRoundDurationChannel.class, Long.valueOf(((DrawGuessWordlistResponse) baseResponse.data).duration));
                }
                C1C7U.LIZIZ("DrawGuessWordListUtil@8b8a.requestWordList$1");
            }
        }, new C09JN() { // from class: X.0JFj
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DrawGuessWordListUtil@8b8a.requestWordList$2");
                C488910JFh.LIZJ = false;
                C488910JFh.LIZLLL = false;
                C1C7U.LIZIZ("DrawGuessWordListUtil@8b8a.requestWordList$2");
            }
        });
    }

    public static DrawGuessWord LIZIZ() {
        if (!LIZLLL) {
            return null;
        }
        C01GW c01gw = LIZ;
        if (((ArrayList) c01gw.getValue()).size() < 3 && !LIZJ) {
            LIZJ();
        }
        ArrayList arrayList = (ArrayList) c01gw.getValue();
        DrawGuessWord drawGuessWord = arrayList.isEmpty() ^ true ? (DrawGuessWord) ListProtector.remove(arrayList, 0) : null;
        LJ = drawGuessWord;
        return drawGuessWord;
    }

    public static void LIZ(DataChannel dataChannel) {
        if (LIZLLL || dataChannel == null) {
            return;
        }
        LIZIZ = dataChannel;
        LIZLLL = true;
        LIZJ();
    }
}
