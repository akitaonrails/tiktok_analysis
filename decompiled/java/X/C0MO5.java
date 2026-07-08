package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.edit.TextPublishUploadModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MO5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.textpublish.TextPublishResolver$resolve$1", f = "TextPublishResolver.kt", l = {}, m = "invokeSuspend")
public final class C0MO5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MO5(String str, Context context, CreativeInfo creativeInfo, int i, String str2, String str3, InterfaceC1364105Vn<? super C0MO5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = context;
        this.LLILLL = creativeInfo;
        this.LLILZ = i;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MO5(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Bitmap bitmapCreateBitmap;
        VideoPublishEditModel videoPublishEditModelLJIIZILJ;
        boolean z;
        boolean z2;
        IAVPublishService iAVPublishServicePublishService;
        AwemeDraft awemeDraftLJ;
        C1C7U.LIZ("TextPublishResolver@efa0.resolve$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C415260GQa c415260GQa = C415260GQa.LIZ;
        final String str = this.LL;
        Context context = this.LLILLJJLI;
        c415260GQa.getClass();
        try {
            final C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.zd);
            LinearLayout linearLayout = new LinearLayout(c1361400lX0, str) { // from class: X.03D1
                {
                    super(c1361400lX0);
                    ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams);
                    setOrientation(1);
                    setGravity(16);
                    setBackgroundColor(ColorProtector.parseColor("#F7F7F7"));
                    TuxTextView tuxTextView = new TuxTextView(c1361400lX0, null, 6, 0);
                    tuxTextView.setText(str);
                    tuxTextView.setTuxFont(11);
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 8388611;
                    layoutParams2.setMargins(iLIZIZ, 0, iLIZIZ, 0);
                    C786410Ut5.R6(tuxTextView, layoutParams2);
                    tuxTextView.setTextColorRes(R.attr.a1h);
                    tuxTextView.setMaxLines(4);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    addView(tuxTextView);
                }
            };
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(linearLayout.getLayoutParams().height, 1073741824));
            linearLayout.layout(0, 0, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
            bitmapCreateBitmap = Bitmap.createBitmap(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            linearLayout.draw(new Canvas(bitmapCreateBitmap));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bitmapCreateBitmap = Bitmap.createBitmap(C415260GQa.LIZIZ, C415260GQa.LIZJ, Bitmap.Config.ARGB_8888);
        }
        C0MO7 c0mo7 = C0MO7.LIZ;
        CreativeInfo creativeInfo = this.LLILLL;
        c0mo7.getClass();
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        C537520L6g.LIZLLL(intent, creativeInfo);
        intent.putExtra("workspace", C14D2.LIZ(creativeInfo));
        intent.putExtra("origin", 0);
        C0MUK.LIZIZ(intent).creativeFlowData = new CreativeFlowData(null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 32767, null);
        C0MUK.LIZIZ(intent).eventData.shootEnterMethod = "";
        intent.putExtra("shoot_way", "story");
        intent.putExtra("content_type", "text");
        intent.putExtra("content_source", "shoot");
        intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
        intent.putExtra("extra_import_compile_cost_time", 0L);
        C01GW c01gw = C0MO7.LIZJ;
        ICreativeSocialBridgeService iCreativeSocialBridgeService = (ICreativeSocialBridgeService) c01gw.getValue();
        if (iCreativeSocialBridgeService != null && (videoPublishEditModelLJIIZILJ = iCreativeSocialBridgeService.LJIIZILJ(intent)) != null) {
            CreativeInfo creativeInfo2 = this.LLILLL;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            videoPublishEditModelLJIIZILJ.setCreationMode(3);
            C577660MlA.LIZ.getClass();
            VideoFileInfo videoFileInfo = new VideoFileInfo(720, 1280, C577660MlA.LIZ().defaultDuration, 30, 0, 0, 0, 0, 0.0f, 496, null);
            String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo2, EnumC20228214Cy.CONCAT, "ahdsaofhuof.mp4", false, 8);
            C570490MZb.LJI(new C0VSJ(strLIZLLL));
            videoPublishEditModelLJIIZILJ.setPreviewInfo(new C538330L9j(720, 1280, 12).LIZ(new EditVideoSegment(strLIZLLL, null, videoFileInfo)));
            videoPublishEditModelLJIIZILJ.isPrivate = 0;
            videoPublishEditModelLJIIZILJ.setShootEnterMethod(str2);
            videoPublishEditModelLJIIZILJ.mShootWay = "text_publish";
            ShootExtraData shootExtraData = videoPublishEditModelLJIIZILJ.getCreativeFlowData().getShootExtraData();
            if (shootExtraData != null) {
                shootExtraData.setShootEnterFrom(str3);
            }
            videoPublishEditModelLJIIZILJ.setEnterFrom(str3);
            videoPublishEditModelLJIIZILJ.setTextPublishUploadModel(new TextPublishUploadModel(this.LL, null, 0, 0, this.LLILZ));
            CaptionModel captionModel = videoPublishEditModelLJIIZILJ.creativeModel.postPageModel.captionModel;
            captionModel.markupText = this.LL;
            captionModel.markupExtra = C13BV.INSTANCE;
            videoPublishEditModelLJIIZILJ.generateVideoCoverPath();
            String videoCoverPath = videoPublishEditModelLJIIZILJ.getVideoCoverPath();
            if (videoCoverPath != null) {
                C2477909nN.LJI(bitmapCreateBitmap, videoCoverPath, null, 0, 6);
                TextPublishUploadModel textPublishUploadModel = videoPublishEditModelLJIIZILJ.creativeModel.textPublishUploadModel;
                if (textPublishUploadModel != null) {
                    textPublishUploadModel.setCoverImageUri(videoPublishEditModelLJIIZILJ.getVideoCoverPath());
                    textPublishUploadModel.setCoverImageHeight(bitmapCreateBitmap.getHeight());
                    textPublishUploadModel.setCoverImageWidth(bitmapCreateBitmap.getWidth());
                }
                ICreativeSocialBridgeService iCreativeSocialBridgeService2 = (ICreativeSocialBridgeService) c01gw.getValue();
                if (iCreativeSocialBridgeService2 != null && (awemeDraftLJ = iCreativeSocialBridgeService2.LJ(videoPublishEditModelLJIIZILJ)) != null) {
                    awemeDraftLJ.LJFF = false;
                }
                C23250099c.LIZLLL((InterfaceC497601wk) C0MO7.LIZIZ.getValue(), null, null, new C540400LHi(videoPublishEditModelLJIIZILJ, null), 3);
                Bundle bundle = new Bundle();
                bundle.putInt("video_type", 11);
                C786410Ut5.LJJIZ(bundle, "extra_video_publish_args", videoPublishEditModelLJIIZILJ);
                C786410Ut5.LJJJI("shoot_way", videoPublishEditModelLJIIZILJ.mShootWay, bundle);
                bundle.getString("creation_id", videoPublishEditModelLJIIZILJ.getCreationId());
                bundle.putInt("publish_private_state", videoPublishEditModelLJIIZILJ.isPrivate());
                bundle.putInt("publish_permission", videoPublishEditModelLJIIZILJ.isPrivate);
                if (videoPublishEditModelLJIIZILJ.getTtStoryUploadModel() != null) {
                    z = true;
                } else {
                    z = false;
                }
                bundle.putBoolean("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH", z);
                if (videoPublishEditModelLJIIZILJ.getTtStoryUploadModel() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bundle.putBoolean("publish_story_mode", z2);
                bundle.putBoolean("publish_retry", false);
                bundle.putBoolean("directly_publish_only", true);
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLJJLI);
                if (c19egLIZIZ != null) {
                    String str4 = this.LLILZLL;
                    String str5 = this.LLILZIL;
                    int i = this.LLILZ;
                    IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                    if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null) {
                        iAVPublishServicePublishService.addPublishCallback(new C0MNL() { // from class: X.0MNA
                            @Override // X.C0MNL, X.InterfaceC1433360nP4
                            public final void LIZIZ(C1434650nR9 c1434650nR9, PublishModel publishModel) {
                            }

                            @Override // X.InterfaceC1433360nP4
                            public final void LIZJ(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z3, PublishModel publishModel) {
                            }

                            @Override // X.C0MNL, X.InterfaceC1433360nP4
                            public final void LJFF(int i2, C1434900nRY c1434900nRY) {
                            }
                        }, iAVPublishServicePublishService.startPublish(c19egLIZIZ, bundle));
                        C557270LtN.LIZ(C0CHQ.LIZ().getPublishService().LJJJLL(), c19egLIZIZ, videoPublishEditModelLJIIZILJ, -1, false, false, new C0MO6(i, videoPublishEditModelLJIIZILJ, str5, str4), null, null, 208);
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TextPublishResolver@efa0.resolve$1");
                return unit;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TextPublishResolver@efa0.resolve$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
