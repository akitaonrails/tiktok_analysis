package X;

import com.bytedance.tts.pigeon.GECPigeon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872800YLu {
    public static final C869590Y9l LIZ(C0Y8T c0y8t, GECPigeon gECPigeon, C0Y8T c0y8t2, Function1<? super C869590Y9l, Unit> function1) {
        C869680Y9u c869680Y9u = new C869680Y9u(gECPigeon.getPigeonIMClient().LIZ.LJ().LJ().getUid(), gECPigeon.getPigeonIMClient().LIZ.LJ().LJ().getSecUid());
        c869680Y9u.conversation(c0y8t2);
        C869590Y9l c869590Y9lBuild = c869680Y9u.build();
        function1.invoke(c869590Y9lBuild);
        c869590Y9lBuild.getExt().putAll(gECPigeon.getPigeonDepend().LJFF().LIZ(c0y8t));
        return c869590Y9lBuild;
    }
}
