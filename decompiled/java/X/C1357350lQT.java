package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.tools.data.MediaPayload;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lQT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357350lQT {
    public AIChatGenPrompt LIZ;
    public final List<MediaPayload> LIZIZ = new ArrayList();

    public static void LIZ(Function1 function1) {
        function1.invoke(new C1357360lQU());
        if (!a0.LJJJIL(r0.LIZ)) {
            "image width must be positive".toString();
            throw new IllegalArgumentException("image width must be positive");
        }
        "image url is required".toString();
        throw new IllegalArgumentException("image url is required");
    }

    public final void LIZIZ(Function1<? super C1356820lPc, Unit> function1) {
        List<MediaPayload> list = this.LIZIZ;
        C1356820lPc c1356820lPc = new C1356820lPc();
        function1.invoke(c1356820lPc);
        if (!((ArrayList) c1356820lPc.LIZ).isEmpty()) {
            if (((ArrayList) c1356820lPc.LIZ).size() > 0) {
                ((ArrayList) list).add(new MediaPayload.ImageCollection(C13LP.LLIIII(c1356820lPc.LIZ), c1356820lPc.LIZIZ, 0, UUID.randomUUID().toString()));
                return;
            } else {
                "coverIndex out of bounds".toString();
                throw new IllegalArgumentException("coverIndex out of bounds");
            }
        }
        "image collection must have at least one image".toString();
        throw new IllegalArgumentException("image collection must have at least one image");
    }
}
