package X;

import Y.AfS148S0200000_12;
import Y.AfS178S0100000_9;
import com.bytedance.android.livesdk.qa.LivesdkQaApiRetryCountSetting;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UNT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNT {
    public static int LIZJ;
    public static long LJFF;
    public static boolean LJII;
    public static int LJIIIIZZ;
    public static final C0UNT LIZ = new C0UNT();
    public static boolean LIZIZ = true;
    public static int LIZLLL = 1;
    public static final List<QuestionEx> LJ = new ArrayList();
    public static final C11NJ LJI = new C11NJ();
    public static final int LJIIIZ = LivesdkQaApiRetryCountSetting.INSTANCE.getValue();

    public static void LIZ() {
        LJI.LJ();
        LIZIZ = true;
        LIZJ = 0;
        LIZLLL = 1;
        ((ArrayList) LJ).clear();
    }

    public final void LIZIZ(int i, int i2, int i3, Function1<? super List<QuestionEx>, Unit> function1) {
        int i4;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || LJFF != room.getId() || LJIIIIZZ != i2) {
            LIZ();
            LJIIIIZZ = i2;
        }
        ArrayList arrayList = (ArrayList) LJ;
        if (arrayList.size() < i && (i3 < (i4 = LJIIIZ) || i4 <= 0)) {
            LIZLLL(this, arrayList.isEmpty(), i2, new C0UNU(i, i2, i3, function1), 8);
            return;
        }
        if (arrayList.isEmpty()) {
            if (function1 != null) {
                function1.invoke(C13BV.INSTANCE);
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < i; i5++) {
            List<QuestionEx> list = LJ;
            arrayList2.add(ListProtector.get(list, LIZJ));
            int i6 = LIZJ + 1;
            LIZJ = i6;
            if (i6 >= ((ArrayList) list).size()) {
                LIZJ = 0;
            }
        }
        int i7 = LIZJ + 4;
        ArrayList arrayList3 = (ArrayList) LJ;
        if (i7 >= arrayList3.size() && LIZIZ && !LJII) {
            LIZLLL(this, arrayList3.isEmpty(), i2, null, 12);
        }
        if (function1 == null) {
            return;
        }
        function1.invoke(arrayList2);
    }

    public static void LIZLLL(C0UNT c0unt, boolean z, int i, C0UNU c0unu, int i2) {
        if ((i2 & 4) != 0) {
            c0unu = null;
        }
        if (z) {
            c0unt.getClass();
            LIZ();
        } else {
            c0unt.getClass();
        }
        if (!LIZIZ) {
            if (c0unu != null) {
                c0unu.invoke(new ArrayList());
                return;
            }
            return;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return;
        }
        if (LJFF != room.getId()) {
            c0unt.getClass();
            LIZ();
            LJFF = room.getId();
        }
        LJII = true;
        QAApi qAApi = (QAApi) C482260Ivg.LIZJ(QAApi.class);
        long id = room.getId();
        int i3 = LIZLLL;
        if (!C472950Igf.LIZ) {
            i = 2;
        }
        LJI.LIZ(qAApi.getRecommendQuestion(id, i3, i).LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(c0unu, (Object) null, 76), new AfS178S0100000_9((Function1) null, (Function1<? super Throwable, Unit>) 79)));
    }
}
