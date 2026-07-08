package X;

import android.net.Uri;
import android.util.Size;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0l0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341200l0Q {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final float LIZJ;
    public static final float LIZLLL;
    public static final int LJ;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
        LIZ = iLIZIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));
        LIZIZ = iLIZIZ2;
        float f = iLIZIZ;
        float f2 = iLIZIZ2;
        LIZJ = f / f2;
        LIZLLL = f2 / f;
        LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    }

    public static Size LIZ(AbstractC1341280l0Y abstractC1341280l0Y) {
        int i;
        int i2;
        int width = abstractC1341280l0Y.LIZ().getWidth();
        int height = abstractC1341280l0Y.LIZ().getHeight();
        if (width != 0 && height != 0) {
            float f = width / height;
            float f2 = LIZJ;
            if (f < f2) {
                i = LIZ;
                i2 = LIZIZ;
            } else if (f <= LIZLLL && f2 <= f) {
                if (width < height) {
                    i = LIZ;
                    i2 = (int) (i / f);
                } else {
                    i2 = LIZ;
                    i = (int) (i2 * f);
                }
            } else {
                i = LIZIZ;
                i2 = LIZ;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) C277060AtU.LIZ.getValue()).intValue())));
            if (iLIZIZ > 0) {
                i = (int) (iLIZIZ * (i / i2));
                i2 = iLIZIZ;
            }
            return new Size(i, i2);
        }
        return new Size(-1, -1);
    }

    public static C1341210l0R LIZLLL(Comment comment) {
        List<CommentImageStruct> imageList;
        if (comment != null && (imageList = comment.getImageList()) != null && !imageList.isEmpty()) {
            return LJFF(comment, EnumC1341600l14.LIST_PHOTO);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        if (r0 < r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1341210l0R LJ(com.ss.android.ugc.aweme.comment.model.Comment r9) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341200l0Q.LJ(com.ss.android.ugc.aweme.comment.model.Comment):X.0l0R");
    }

    public static C1341210l0R LJFF(Comment comment, EnumC1341600l14 enumC1341600l14) {
        boolean z;
        CommentImageStruct commentImageStruct;
        CommentImageStruct commentImageStruct2;
        String editImageBitmap = comment.getEditImageBitmap();
        int i = 0;
        if (editImageBitmap != null && editImageBitmap.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            List<CommentImageStruct> imageList = comment.getImageList();
            if (imageList == null || (commentImageStruct2 = (CommentImageStruct) C13LP.LJJJLZIJ(0, imageList)) == null) {
                return null;
            }
            int width = commentImageStruct2.getWidth();
            if (width < 0) {
                width = 0;
            }
            int height = commentImageStruct2.getHeight();
            if (height >= 0) {
                i = height;
            }
            C1341230l0T c1341230l0T = new C1341230l0T(Uri.fromFile(new C0VSJ(editImageBitmap)), new Size(width, i));
            return new C1341210l0R(enumC1341600l14, c1341230l0T, LIZ(c1341230l0T), null);
        }
        List<CommentImageStruct> imageList2 = comment.getImageList();
        if (imageList2 == null || (commentImageStruct = (CommentImageStruct) C13LP.LJJJLZIJ(0, imageList2)) == null) {
            return null;
        }
        UrlModel cropUrl = commentImageStruct.getCropUrl();
        if (cropUrl == null && (cropUrl = commentImageStruct.getOriginUrl()) == null) {
            return null;
        }
        int width2 = cropUrl.getWidth();
        if (width2 < 0) {
            width2 = 0;
        }
        int height2 = cropUrl.getHeight();
        if (height2 >= 0) {
            i = height2;
        }
        C1341220l0S c1341220l0S = new C1341220l0S(cropUrl, new Size(width2, i));
        return new C1341210l0R(enumC1341600l14, c1341220l0S, LIZ(c1341220l0S), comment.getCid());
    }

    public static C1341210l0R LIZIZ(int i, String str, String str2) {
        if (str != null && str.length() != 0) {
            return new C1341210l0R(EnumC1341600l14.LIST_AVATAR, new C1341250l0V(str), new Size(i, i), str2);
        }
        return null;
    }

    public static C1341210l0R LIZJ(UrlModel urlModel, String str, int i) {
        if (urlModel == null) {
            return null;
        }
        return new C1341210l0R(EnumC1341600l14.LIST_AVATAR, new C1341240l0U(urlModel), new Size(i, i), str);
    }
}
