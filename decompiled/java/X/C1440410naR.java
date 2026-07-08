package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import com.ss.android.ugc.aweme.edit.RevealStoryImageInfo;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0naR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440410naR extends AbstractC1434490nQt {
    public ViewGroup LLILZLL;
    public AppCompatImageView LLIZ;
    public C0F4H LLIZLLLIL;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.STORY_REVEAL_SYNTHESIS;
    }

    public static ImageSynthesisResult LJIILLIIL(ImageSynthesisResult imageSynthesisResult) {
        if (imageSynthesisResult.getPath().length() > 0 && C2286708xd.LIZJ(imageSynthesisResult.getPath())) {
            return imageSynthesisResult;
        }
        return null;
    }

    public static PublishImageModel LJIIZILJ(ImageSynthesisResult imageSynthesisResult) {
        return new PublishImageModel(imageSynthesisResult.getPath(), imageSynthesisResult.getWidth(), imageSynthesisResult.getHeight(), null, null, true);
    }

    public static final void LJIILJJIL(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object obj;
        Object next;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof SynthetiseResult) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof SynthetiseResult) {
            obj = next;
        }
        c1431070nLN.LJ(obj, true);
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object obj;
        Object next;
        List<PublishImageModel> list;
        String str;
        Object next2;
        VideoPublishEditModel videoPublishEditModel;
        String parent;
        C090I c090i;
        Object objLJIIZILJ;
        PublishImageModel publishImageModelLJIIZILJ;
        Object next3;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof SynthetiseResult) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof SynthetiseResult)) {
            next = null;
        }
        SynthetiseResult synthetiseResult = (SynthetiseResult) next;
        if (synthetiseResult != null && (list = synthetiseResult.imageSynthesisResult) != null) {
            PublishImageModel publishImageModel = (PublishImageModel) C13LP.LJJJLL(list);
            if (publishImageModel != null && (str = publishImageModel.path) != null) {
                Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2 instanceof C1434960nRe) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (!(next2 instanceof C1434960nRe)) {
                    next2 = null;
                }
                C1434960nRe c1434960nRe = (C1434960nRe) next2;
                if (c1434960nRe != null && (videoPublishEditModel = c1434960nRe.LIZ) != null) {
                    RevealStoryCreationModel revealStoryInfos = videoPublishEditModel.creativeModel.storyModel.getRevealStoryInfos();
                    Context contextLJFF = C2214201BlK.LJFF();
                    if (contextLJFF == null) {
                        contextLJFF = C1BWL.LIZ();
                    }
                    FrameLayout frameLayout = new FrameLayout(contextLJFF);
                    AppCompatImageView appCompatImageView = new AppCompatImageView(contextLJFF);
                    C786410Ut5.h6(appCompatImageView, new FrameLayout.LayoutParams(-1, -1));
                    this.LLIZ = appCompatImageView;
                    frameLayout.addView(appCompatImageView);
                    C0F4H c0f4hLIZIZ = C0F4G.LIZIZ(contextLJFF);
                    C0F4G.LIZ(c0f4hLIZIZ, revealStoryInfos, C0F4G.LIZIZ);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0f4hLIZIZ);
                    c0f4hLIZIZ.setLayoutParams(layoutParams);
                    this.LLIZLLLIL = c0f4hLIZIZ;
                    frameLayout.addView(c0f4hLIZIZ);
                    this.LLILZLL = frameLayout;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                    if (bitmapDecodeFile == null || (parent = new C0VSJ(str).getParent()) == null) {
                        c090i = new C090I(null, null, 14);
                    } else {
                        try {
                            c090i = (C090I) C23250099c.LJ(C0PEM.LIZJ, new C090H(this, bitmapDecodeFile, parent, revealStoryInfos, null));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            c090i = new C090I(null, null, 14);
                        }
                    }
                    List listLIZIZ = C19719512Dh.LIZIZ(list);
                    Object obj2 = ListProtector.get(listLIZIZ, 0);
                    ImageSynthesisResult imageSynthesisResult = c090i.LIZIZ;
                    if (imageSynthesisResult != null) {
                        PublishImageModel publishImageModelLJIIZILJ2 = LJIIZILJ(imageSynthesisResult);
                        ListProtector.add(listLIZIZ, 0, publishImageModelLJIIZILJ2);
                        RevealStoryImageInfo revealStoryImageInfo = new RevealStoryImageInfo(2, 0);
                        ImageSynthesisResult imageSynthesisResult2 = c090i.LIZJ;
                        if (imageSynthesisResult2 != null) {
                            objLJIIZILJ = LJIIZILJ(imageSynthesisResult2);
                        } else {
                            objLJIIZILJ = null;
                        }
                        ImageSynthesisResult imageSynthesisResult3 = c090i.LIZLLL;
                        if (imageSynthesisResult3 != null) {
                            publishImageModelLJIIZILJ = LJIIZILJ(imageSynthesisResult3);
                        } else {
                            publishImageModelLJIIZILJ = null;
                        }
                        if (objLJIIZILJ == null) {
                            objLJIIZILJ = obj2;
                        }
                        listLIZIZ.add(objLJIIZILJ);
                        RevealStoryImageInfo revealStoryImageInfo2 = new RevealStoryImageInfo(2, listLIZIZ.size() - 1);
                        if (publishImageModelLJIIZILJ != null) {
                            obj2 = publishImageModelLJIIZILJ;
                        }
                        listLIZIZ.add(obj2);
                        RevealStoryImageInfo revealStoryImageInfo3 = new RevealStoryImageInfo(2, listLIZIZ.size() - 1);
                        TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel.creativeModel.ttStoryUploadModel;
                        if (tTStoryUploadModel != null) {
                            tTStoryUploadModel.setRevealStoryModel(new RevealStoryCreationModel(new RevealStoryImageInfo(2, 1), revealStoryImageInfo, revealStoryImageInfo2, revealStoryImageInfo3, publishImageModelLJIIZILJ2.path, null, null, null));
                        }
                        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next3 = it4.next();
                                if (next3 instanceof SynthetiseResult) {
                                    break;
                                }
                            } else {
                                next3 = null;
                                break;
                            }
                        }
                        if (next3 instanceof SynthetiseResult) {
                            obj = next3;
                        }
                        c1431070nLN.LJ(obj, false);
                    }
                    LJIILJJIL(c1404610meh, c1431070nLN);
                    return;
                }
                LJIILJJIL(c1404610meh, c1431070nLN);
                return;
            }
            LJIILJJIL(c1404610meh, c1431070nLN);
            return;
        }
        LJIILJJIL(c1404610meh, c1431070nLN);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.InterfaceC497601wk r13, android.graphics.Bitmap r14, java.lang.String r15, X.InterfaceC1364105Vn<? super X.C090I> r16) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1440410naR.LJIILL(X.01wk, android.graphics.Bitmap, java.lang.String, X.05Vn):java.lang.Object");
    }
}
