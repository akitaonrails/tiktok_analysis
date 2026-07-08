package X;

import android.util.Log;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.IOException;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1436010nTL extends C2217421BqW implements Function0<Unit> {
    public C1436010nTL(C1465460oEq c1465460oEq) {
        super(0, c1465460oEq, C1465460oEq.class, "startCompile", "startCompile()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws IOException {
        C1465460oEq c1465460oEq = (C1465460oEq) this.receiver;
        c1465460oEq.getClass();
        C1440470naX c1440470naX = C1440470naX.LIZ;
        VideoPublishEditModel videoPublishEditModel = c1465460oEq.LIZIZ;
        c1440470naX.getClass();
        C1440470naX.LIZIZ(videoPublishEditModel, null);
        C15O7.LIZIZ(new Callable() { // from class: X.08ns
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("StickerInfoInit@7b1a.startCompile$1");
                Integer numValueOf = Integer.valueOf(Log.e("change_avatar_mode", "text compile finish"));
                C1C7U.LIZIZ("StickerInfoInit@7b1a.startCompile$1");
                return numValueOf;
            }
        }, C15O7.LJIIIIZZ, null);
        return Unit.LIZ;
    }
}
