package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12BY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12BY {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawCircle(bitmap.getWidth() / 2.0f, bitmap.getWidth() / 2.0f, bitmap.getWidth() / 2.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static void LIZJ(User user, StoryNoteInfoModel storyNoteInfoModel, Function1 function1) {
        AvatarThoughtInfo avatarThoughtInfo;
        List<String> list;
        AvatarThoughtInfo avatarThoughtInfo2;
        List<Bitmap> list2;
        Object objLJJJLL;
        if (storyNoteInfoModel != null && (list2 = storyNoteInfoModel.extractedBitmap) != null && (objLJJJLL = C13LP.LJJJLL(list2)) != null) {
            function1.invoke(objLJJJLL);
            return;
        }
        if (C298590Bn7.LIZ()) {
            List<String> list3 = null;
            if (storyNoteInfoModel != null && (avatarThoughtInfo = storyNoteInfoModel.avatarInfo) != null && (list = avatarThoughtInfo.avatarPrimaryUrlList) != null && !list.isEmpty()) {
                if (storyNoteInfoModel != null && (avatarThoughtInfo2 = storyNoteInfoModel.avatarInfo) != null) {
                    list3 = avatarThoughtInfo2.avatarPrimaryUrlList;
                }
                C1331660kl2.LJIIJ(new C03IT(list3)).LJJIIJ(new C19772512Xr(function1, 7));
                return;
            }
        }
        C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarMedium())).LJJIIJ(new C19772512Xr(function1, 8));
    }

    public static final void LIZIZ(C12BX c12bx, View view, Function1<? super Bitmap, Unit> function1, ImageView imageView, C415650GRn c415650GRn, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            imageView.setImageBitmap(bitmap2);
        }
        c12bx.LIZJ(c415650GRn, bitmap);
        function1.invoke(Bitmap.createBitmap(C19724012Fa.LIZ(view, Bitmap.Config.ARGB_8888), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(45.5f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(75.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(302.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(537.0f)))));
    }
}
