package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$enterRecordActivityForUGCTemplate$8", f = "MvChoosePhotoScene.kt", l = {8019}, m = "invokeSuspend")
public final class C526170KkJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ MvChoosePhotoScene LLILZ;
    public final /* synthetic */ RecordConfig.Builder LLILZIL;
    public final /* synthetic */ C259800zU<TemplateSlot> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526170KkJ(Activity activity, String str, MvChoosePhotoScene mvChoosePhotoScene, RecordConfig.Builder builder, C259800zU<TemplateSlot> c259800zU, C259800zU<String> c259800zU2, InterfaceC1364105Vn<? super C526170KkJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = mvChoosePhotoScene;
        this.LLILZIL = builder;
        this.LLILZLL = c259800zU;
        this.LLIZ = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526170KkJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C531370Ksh c531370Ksh;
        Activity activity;
        String str;
        Workspace workspace;
        C1C7U.LIZ("MvChoosePhotoScene@c985.enterRecordActivityForUGCTemplate$8");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ITemplateAlbumService iTemplateAlbumService = C523300Kfg.LIZ;
            if (iTemplateAlbumService != null) {
                Activity activity2 = this.LLILLJJLI;
                String str2 = this.LLILLL;
                this.LL = 1;
                obj = iTemplateAlbumService.LIZLLL(activity2, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MvChoosePhotoScene@c985.enterRecordActivityForUGCTemplate$8");
                    return objLJFF;
                }
            } else {
                c531370Ksh = null;
                this.LLILZ.dismissEnterRecordLoading();
                if (c531370Ksh == null && (str = c531370Ksh.LIZLLL) != null && str.length() > 0 && new C0VSJ(str).exists()) {
                    AVMusic aVMusic = c531370Ksh.LIZJ;
                    if (aVMusic != null) {
                        this.LLILZ.musicModel = C389120FNm.LIZ(aVMusic);
                    }
                    MvChoosePhotoScene mvChoosePhotoScene = this.LLILZ;
                    if (mvChoosePhotoScene.musicModel == null) {
                        mvChoosePhotoScene.enterRecordWithoutMusic(this.LLILZIL);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("MvChoosePhotoScene@c985.enterRecordActivityForUGCTemplate$8");
                        return unit;
                    }
                    ShortVideoContext shortVideoContext = mvChoosePhotoScene.shortVideoContext;
                    if (shortVideoContext != null && (workspace = shortVideoContext.cameraComponentModel.mWorkspace) != null) {
                        workspace.MC(str);
                    }
                    MvChoosePhotoScene mvChoosePhotoScene2 = this.LLILZ;
                    Pair<Integer, Integer> musicClipTime = mvChoosePhotoScene2.getMusicClipTime(this.LLILZLL.element, mvChoosePhotoScene2.clipProcessMusicItem, mvChoosePhotoScene2.musicModel);
                    if (musicClipTime == null) {
                        this.LLILZ.enterRecordWithoutMusic(this.LLILZIL);
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("MvChoosePhotoScene@c985.enterRecordActivityForUGCTemplate$8");
                        return unit2;
                    }
                    this.LLILZIL.musicStart(musicClipTime.getFirst());
                    this.LLILZIL.musicEnd(musicClipTime.getSecond());
                    this.LLILZIL.musicOrigin(this.LLIZ.element);
                    this.LLILZ.enterRecordAfterUgcMusicPrepared(this.LLILZIL);
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("MvChoosePhotoScene@c985.enterRecordActivityForUGCTemplate$8");
                    return unit3;
                }
                if (!this.LLILZ.isFinishing() && (activity = this.LLILZ.mActivity) != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131829551);
                    C1390380mHk.LIZ(activity, 1076, creativeToastBuilder);
                }
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("MvChoosePhotoScene@c985.enterRecordActivityForUGCTemplate$8");
                return unit4;
            }
        }
        c531370Ksh = (C531370Ksh) obj;
        this.LLILZ.dismissEnterRecordLoading();
        if (c531370Ksh == null) {
        }
        if (!this.LLILZ.isFinishing()) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131829551);
            C1390380mHk.LIZ(activity, 1076, creativeToastBuilder2);
        }
        Unit unit42 = Unit.LIZ;
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.enterRecordActivityForUGCTemplate$8");
        return unit42;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
