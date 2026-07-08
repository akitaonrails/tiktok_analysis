package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EvP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380170EvP {
    public final C372480Ej0 LIZ;
    public final Function0<VideoPublishEditModel> LIZIZ;
    public final Function1<VideoPublishEditModel, Unit> LIZJ;
    public C0P0T LIZLLL;

    public C380170EvP(C372480Ej0 c372480Ej0, AwS549S0100000_5 awS549S0100000_5, AwS584S0100000_5 awS584S0100000_5) {
        this.LIZ = c372480Ej0;
        this.LIZIZ = awS549S0100000_5;
        this.LIZJ = awS584S0100000_5;
    }

    public static void LIZ(C380170EvP c380170EvP, C380160EvO[] c380160EvOArr, Function1 function1) {
        View view;
        C0P0T c0p0t;
        AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(441);
        C0P0T c0p0t2 = c380170EvP.LIZLLL;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = c380170EvP.LIZLLL) != null) {
            c0p0t.dismiss();
        }
        Context sceneContext = c380170EvP.LIZ.getSceneContext();
        if (sceneContext != null) {
            C1361400lX0 c1361400lX0 = new C1361400lX0(sceneContext, R.style.y0);
            ArrayList arrayList = new ArrayList(c380160EvOArr.length);
            for (C380160EvO c380160EvO : c380160EvOArr) {
                arrayList.add(new C443090HZb(c380170EvP.LIZ.getString(c380160EvO.LIZIZ), new AwS549S0100000_5(c380160EvO, 1137), c380160EvO.LIZJ, null, 0, null, c380160EvO.LIZ, false, false, null, 952));
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            VideoPublishEditModel videoPublishEditModelInvoke = c380170EvP.LIZIZ.invoke();
            if (videoPublishEditModelInvoke != null) {
                IDMSendToFriendMenuActionHelper.LIZ.getClass();
                IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
                if (iDMSendToFriendMenuActionHelperLIZ != null && iDMSendToFriendMenuActionHelperLIZ.LIZIZ() && videoPublishEditModelInvoke.getVideoLength() <= 60000) {
                    C1717206ny.LIZ(iDMSendToFriendMenuActionHelperLIZ.LIZ(sceneContext, new AwS406S0200000_5(c380170EvP, videoPublishEditModelInvoke, 112)), arrayList2);
                }
            }
            C0EGE c0ege = c380170EvP.LIZ.LLLILZ;
            if (c0ege != null && (view = c0ege.LIZJ) != null) {
                C0HWQ c0hwq = new C0HWQ(c1361400lX0);
                c0hwq.LJIIL(Collections.singletonList(arrayList2));
                c0hwq.LLJ = true;
                C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                c1391600mJi.LIZIZ = view;
                c1391600mJi.LJIJJ = true;
                c1391600mJi.LJIIL = false;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c0hwq.LJ(new AwS406S0200000_5(function1, (Function1<? super List<C380160EvO>, Unit>) c380160EvOArr, (C380160EvO[]) 113));
                c0hwq.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                c0hwq.LIZJ(aFwS234S0000000_5);
                C0P0T c0p0tLIZIZ = c0hwq.LIZIZ();
                c380170EvP.LIZLLL = c0p0tLIZIZ;
                c0p0tLIZIZ.show();
            }
        }
    }
}
