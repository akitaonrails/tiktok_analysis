package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Q6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q6Y {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LIZ(ITextToImageService iTextToImageService, Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, Function0 function0, Function1 function1, int i) {
        Function0 function02 = function0;
        Function1 function12 = null;
        if ((i & 8) != 0) {
            function02 = null;
        }
        if ((i & 16) == 0) {
            function12 = function1;
        }
        iTextToImageService.LJJIJIIJIL(context, forwardMedia, c572370Mcd, function02, function12);
    }
}
