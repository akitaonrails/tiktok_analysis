package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.comment.image.CommentImageEditActivity;

/* JADX INFO: renamed from: X.0nsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451550nsP {
    public static void LIZ(AbstractC738140SxQ abstractC738140SxQ, Context context, C1451560nsQ c1451560nsQ) {
        Intent intent = c1451560nsQ.LIZJ;
        if (intent == null) {
            intent = new Intent(context, (Class<?>) CommentImageEditActivity.class);
        }
        intent.setClass(context, CommentImageEditActivity.class);
        intent.putExtra("image_edit_model", c1451560nsQ.LIZIZ);
        intent.putExtra("image_edit_crop_only", c1451560nsQ.LIZLLL);
        intent.putExtra("image_edit_path", c1451560nsQ.LJ);
        intent.putExtra("image_edit_aweme", c1451560nsQ.LJI);
        intent.putExtra("image_edit_enter_from", c1451560nsQ.LJII);
        intent.putExtra("image_edit_session_id", c1451560nsQ.LJIIIIZZ);
        intent.putExtra("is_from_internal_image_page", c1451560nsQ.LJIIIZ);
        C724240Sb0.LJIIIIZZ(abstractC738140SxQ, abstractC738140SxQ, intent, c1451560nsQ.LIZ, null, c1451560nsQ.LJFF);
    }
}
