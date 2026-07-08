package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC580190MpF extends C12VK {
    void LIZ();

    String LIZIZ(Context context);

    boolean LIZJ();

    void LIZLLL(String str, String str2, String str3, String str4, C1B4F c1b4f, int i);

    C1402840mbq LJ(VideoPublishEditModel videoPublishEditModel);

    boolean LJFF(Context context);

    void LJI(Activity activity);

    void LJIIIIZZ();

    void LJIIIZ(C19EG c19eg, BaseShortVideoContext baseShortVideoContext, C1B4F c1b4f);

    void LJIIJ(Activity activity, String str, C1402840mbq c1402840mbq, Boolean bool, C1B4F c1b4f);

    void LJIIJJI(C19GS c19gs, VideoPublishEditModel videoPublishEditModel, Boolean bool, C1B4F c1b4f);

    void onBackToOpenPlatform(BaseShortVideoContext baseShortVideoContext);

    void onBackToTikTokMusic(Activity activity);
}
