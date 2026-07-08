package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Kfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523310Kfh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MvChoosePhotoScene LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C259800zU<TemplateSlot> LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ RecordConfig.Builder LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C523310Kfh(MvChoosePhotoScene mvChoosePhotoScene, boolean z, C259800zU<TemplateSlot> c259800zU, C013C c013c, RecordConfig.Builder builder, C118300cf c118300cf, C118300cf c118300cf2, C259800zU<String> c259800zU2) {
        super(0);
        this.LL = mvChoosePhotoScene;
        this.LLILLJJLI = z;
        this.LLILLL = c259800zU;
        this.LLILZ = c013c;
        this.LLILZIL = builder;
        this.LLILZLL = c118300cf;
        this.LLIZ = c118300cf2;
        this.LLIZLLLIL = c259800zU2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activity;
        Workspace workspace;
        this.LL.dismissEnterRecordLoading();
        if (this.LLILLJJLI) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LL;
            Pair<Integer, Integer> musicClipTime = mvChoosePhotoScene.getMusicClipTime(this.LLILLL.element, mvChoosePhotoScene.clipProcessMusicItem, mvChoosePhotoScene.musicModel);
            if (musicClipTime != null) {
                C118300cf c118300cf = this.LLILZLL;
                C118300cf c118300cf2 = this.LLIZ;
                C013C c013c = this.LLILZ;
                c118300cf.element = musicClipTime.getFirst().intValue();
                c118300cf2.element = musicClipTime.getSecond().intValue();
                c013c.element = true;
            } else {
                new AwS552S0100000_8(this.LLILZ, 298);
            }
            if (this.LLILZ.element) {
                this.LLILZIL.musicStart(Integer.valueOf(this.LLILZLL.element));
                this.LLILZIL.musicEnd(Integer.valueOf(this.LLIZ.element));
                this.LLILZIL.musicOrigin(this.LLIZLLLIL.element);
                MvChoosePhotoScene mvChoosePhotoScene2 = this.LL;
                ShortVideoContext shortVideoContext = mvChoosePhotoScene2.shortVideoContext;
                if (shortVideoContext != null && (workspace = shortVideoContext.cameraComponentModel.mWorkspace) != null) {
                    workspace.MC(mvChoosePhotoScene2.ugcTemplateMusicPath);
                }
                this.LL.enterRecordAfterUgcMusicPrepared(this.LLILZIL);
            } else {
                this.LL.enterRecordWithoutMusic(this.LLILZIL);
            }
        } else if (!this.LL.isFinishing() && (activity = this.LL.mActivity) != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829551);
            C1390380mHk.LIZ(activity, 1076, creativeToastBuilder);
        }
        return Unit.LIZ;
    }
}
