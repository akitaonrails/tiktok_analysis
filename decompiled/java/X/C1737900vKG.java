package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Patterns;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftExtraInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vKG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737900vKG {
    public static final int LJIILL() {
        try {
            return C558520LvO.LIZ().maxPackSizeBytes;
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            return 8388608;
        }
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static final C0LAB LJFF(MobileEffectData mobileEffectData) {
        String templateResourceId;
        String templateName;
        String str;
        MobileEffectTemplateInfo mobileEffectTemplateInfo;
        MobileEffectTemplateInfo mobileEffectTemplateInfo2;
        C0LAB c0lab = new C0LAB();
        NewFaceStickerBean newFaceStickerBean = mobileEffectData.effect;
        String str2 = null;
        if (newFaceStickerBean != null && (mobileEffectTemplateInfo2 = newFaceStickerBean.mobileEffectTemplate) != null) {
            templateResourceId = mobileEffectTemplateInfo2.getTemplateResourceId();
        } else {
            templateResourceId = null;
        }
        c0lab.LJ("template_id", templateResourceId);
        NewFaceStickerBean newFaceStickerBean2 = mobileEffectData.effect;
        if (newFaceStickerBean2 != null && (mobileEffectTemplateInfo = newFaceStickerBean2.mobileEffectTemplate) != null) {
            templateName = mobileEffectTemplateInfo.getTemplateName();
        } else {
            templateName = null;
        }
        c0lab.LJ("template_name", templateName);
        NewFaceStickerBean newFaceStickerBean3 = mobileEffectData.effect;
        if (newFaceStickerBean3 != null) {
            str = newFaceStickerBean3.effectId;
        } else {
            str = null;
        }
        c0lab.LJ("effect_id", str);
        NewFaceStickerBean newFaceStickerBean4 = mobileEffectData.effect;
        if (newFaceStickerBean4 != null) {
            str2 = newFaceStickerBean4.name;
        }
        c0lab.LJ("effect_name", str2);
        return c0lab;
    }

    public static final String LJIILLIIL(Uri uri) {
        String path = uri.getPath();
        if (path != null && path.length() != 0) {
            if (Patterns.WEB_URL.matcher(uri.toString()).matches()) {
                return uri.toString();
            }
            return Uri.fromFile(new C0VSJ(uri.getPath())).toString();
        }
        return "";
    }

    public static SpannableStringBuilder LJIIZILJ(final Context context) {
        final int iIntValue;
        String string = context.getString(2131833772);
        final int iIntValue2 = 0;
        String string2 = context.getString(2131833758, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        C786410Ut5.q2(spannableStringBuilder, new AbstractC431340Gvk(iIntValue, iIntValue2) { // from class: X.0s9P
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
                intent.setData(UriProtector.parse("https://effecthouse.tiktok.com/learn/guides/publishing/effect-guidelines/"));
                intent.putExtra("use_webview_title", true);
                Context context2 = context;
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context2);
                C2204961BRm.LJJJJJL(context2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bI+A0T2jvUDehdvsfnx1BMq2YOsmCX4p9zTq+HMAoOpTsdM=", null));
            }

            @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
                super.updateDrawState(textPaint);
            }
        }, iLJJJ, string.length() + iLJJJ, 34);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, true), iLJJJ, string.length() + iLJJJ, 34);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder LJIJ(final Context context) {
        int iIntValue;
        String string = context.getString(2131833770);
        String string2 = context.getString(2131833772);
        String string3 = context.getString(2131833771, string, string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, string3.length(), 34);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, true), 0, string.length(), 34);
        int iLJJJ = a0.LJJJ(string3, string2, 0, false, 6);
        final int iLIZ = C446980Hfs.LIZ(context, R.color.ct);
        final int iLIZ2 = C446980Hfs.LIZ(context, R.color.ct);
        C786410Ut5.q2(spannableStringBuilder, new AbstractC431340Gvk(iLIZ, iLIZ2) { // from class: X.0s9Q
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
                intent.setData(UriProtector.parse("https://effecthouse.tiktok.com/learn/guides/publishing/effect-guidelines/"));
                intent.putExtra("use_webview_title", true);
                Context context2 = context;
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context2);
                C2204961BRm.LJJJJJL(context2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bI+A0T2jvUDehdvsfnx1BMq2YOsmCX4p9zTq+HMAoOpTsdM=", null));
            }

            @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
                super.updateDrawState(textPaint);
            }
        }, iLJJJ, string2.length() + iLJJJ, 34);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, true), iLJJJ, string2.length() + iLJJJ, 34);
        return spannableStringBuilder;
    }

    public static final Object LJIJI(InterfaceC1364105Vn<? super C1738190vKj<UploadAuthKeyConfig>> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ListenableFuture<VideoCreation> listenableFutureLIZIZ = C0CHQ.LIZ().getPublishService().LJJIJIIJIL().LIZIZ(null, false);
        C11U6<VideoCreation> c11u6 = new C11U6<VideoCreation>() { // from class: X.08vR
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fail to get auth key: ");
                sbLIZ.append(th);
                C201955140j.LJIIIIZZ(c20012313Rx, "DiyProp", C2188811AlT.LIZIZ(sbLIZ));
                C1738190vKj c1738190vKj = new C1738190vKj(false, null, -9004, th.getMessage(), System.currentTimeMillis() - jCurrentTimeMillis, null, 34);
                InterfaceC1364105Vn<C1738190vKj<UploadAuthKeyConfig>> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(c1738190vKj);
                interfaceC1364105Vn2.resumeWith(c1738190vKj);
            }

            @Override // X.C11U6
            public final void onSuccess(VideoCreation videoCreation) {
                C1738190vKj c1738190vKj;
                if (videoCreation instanceof UploadAuthKeyConfig) {
                    c1738190vKj = new C1738190vKj(true, videoCreation, 0, null, System.currentTimeMillis() - jCurrentTimeMillis, null, 44);
                } else {
                    c1738190vKj = new C1738190vKj(false, null, -9004, "auth key type mismatch", System.currentTimeMillis() - jCurrentTimeMillis, null, 34);
                }
                InterfaceC1364105Vn<C1738190vKj<UploadAuthKeyConfig>> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(c1738190vKj);
                interfaceC1364105Vn2.resumeWith(c1738190vKj);
            }
        };
        listenableFutureLIZIZ.LJIIJJI(new C135Q(listenableFutureLIZIZ, c11u6), EnumC2272608vM.LL);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static final boolean LJIJJ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean("isAI");
        boolean zLJFF = Intrinsics.LJFF(jSONObject.optString("AIType"), "aigc");
        if (zOptBoolean || zLJFF) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(C0LAB c0lab, EffectPackageDataWrapper effectPackageDataWrapper) {
        String str;
        String str2;
        Long lValueOf;
        String str3;
        String str4;
        Integer numValueOf;
        Integer numValueOf2;
        Long lValueOf2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List<EffectObjectDataWrapper> list;
        String str10;
        String str11 = null;
        if (effectPackageDataWrapper != null) {
            str = effectPackageDataWrapper.projectId;
        } else {
            str = null;
        }
        c0lab.LJ("project_id", str);
        if (effectPackageDataWrapper != null) {
            str2 = effectPackageDataWrapper.projectSource;
        } else {
            str2 = null;
        }
        c0lab.LJ("project_source", str2);
        if (effectPackageDataWrapper != null) {
            lValueOf = Long.valueOf(effectPackageDataWrapper.projectSize);
        } else {
            lValueOf = null;
        }
        c0lab.LIZLLL(lValueOf, "project_size");
        if (effectPackageDataWrapper != null) {
            str3 = effectPackageDataWrapper.templateId;
        } else {
            str3 = null;
        }
        c0lab.LJ("template_id", str3);
        if (effectPackageDataWrapper != null) {
            str4 = effectPackageDataWrapper.templateId;
        } else {
            str4 = null;
        }
        c0lab.LJ("ame_template_id", str4);
        if (effectPackageDataWrapper != null) {
            numValueOf = Integer.valueOf(effectPackageDataWrapper.objectCount);
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "object_cnt");
        if (effectPackageDataWrapper != null) {
            numValueOf2 = Integer.valueOf(effectPackageDataWrapper.sequenceCount);
        } else {
            numValueOf2 = null;
        }
        c0lab.LIZLLL(numValueOf2, "sequence_cnt");
        if (effectPackageDataWrapper != null) {
            lValueOf2 = Long.valueOf(effectPackageDataWrapper.duration);
        } else {
            lValueOf2 = null;
        }
        c0lab.LIZLLL(lValueOf2, "effect_create_duration");
        String str12 = "";
        if (effectPackageDataWrapper == null || (str5 = effectPackageDataWrapper.enterFrom) == null) {
            str5 = "";
        }
        c0lab.LJ("enter_from", str5);
        if (effectPackageDataWrapper == null || (str6 = effectPackageDataWrapper.ameEnterFrom) == null) {
            str6 = "";
        }
        c0lab.LJ("ame_enter_from", str6);
        if (effectPackageDataWrapper != null) {
            str7 = effectPackageDataWrapper.shootPageEnterFrom;
        } else {
            str7 = null;
        }
        c0lab.LJ("shoot_page_enter_from", str7);
        if (effectPackageDataWrapper != null) {
            str8 = effectPackageDataWrapper.tabKey;
        } else {
            str8 = null;
        }
        c0lab.LJ("tab_key", str8);
        if (effectPackageDataWrapper != null) {
            str11 = effectPackageDataWrapper.shootTabName;
        }
        c0lab.LJ("shoot_tab_name", str11);
        if (effectPackageDataWrapper != null && (str10 = effectPackageDataWrapper.templateResId) != null) {
            str12 = str10;
        }
        c0lab.LJ("template_resource_id", str12);
        if (effectPackageDataWrapper != null && (list = effectPackageDataWrapper.objectDataList) != null) {
            Iterator<EffectObjectDataWrapper> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                EffectObjectDataWrapper next = it2.next();
                if (Intrinsics.LJFF(next.addMethod, "onboarding")) {
                    if (next != null) {
                        str9 = "1";
                    }
                }
            }
            str9 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_onboarding", str9);
    }

    public static final void LIZJ(Map<String, String> map, EffectHint effectHint) {
        String hint;
        String hintKey;
        if (effectHint == null || (hint = effectHint.getHint()) == null) {
            hint = "None";
        }
        map.put("hint_text", hint);
        if (effectHint == null || (hintKey = effectHint.getHintKey()) == null) {
            hintKey = "null";
        }
        map.put("hint_id", hintKey);
    }

    public static final void LIZLLL(C0LAB c0lab, EffectPackageDataWrapper effectPackageDataWrapper) {
        String str;
        if (effectPackageDataWrapper != null && C1737280vJG.LIZ(effectPackageDataWrapper)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("if_contains_greenscreen_asset", str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    public static final void LJ(C1322110kVd c1322110kVd, String str) {
        if (TextUtils.isEmpty(str)) {
            C1324750kZt.LIZIZ(c1322110kVd, R.drawable.dhr);
            return;
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
        c1325700kbQLIZLLL.LJIILJJIL = false;
        c1325700kbQLIZLLL.LJIILLIIL = false;
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
        c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
        c1320810kTXLIZJ.LIZLLL = LIZ;
        c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[PHI: r6
      0x001f: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:9:0x001d, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[PHI: r6
      0x0027: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String), (r6v4 java.lang.String) binds: [B:9:0x001d, B:11:0x0021, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[PHI: r11
      0x0071: PHI (r11v6 java.lang.String) = (r11v2 java.lang.String), (r11v7 java.lang.String) binds: [B:42:0x006f, B:40:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd A[PHI: r11
      0x00bd: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v6 java.lang.String), (r11v6 java.lang.String) binds: [B:42:0x006f, B:44:0x0073, B:46:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c4 A[PHI: r10
      0x00c4: PHI (r10v1 boolean) = (r10v0 boolean), (r10v4 boolean) binds: [B:74:0x00c1, B:33:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconInfo LJIIJJI(com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo r15, java.util.List<com.ss.android.ugc.aweme.prop.mobileefffect.EditImage> r16) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1737900vKG.LJIIJJI(com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo, java.util.List):com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconInfo");
    }

    public static final C1737770vK3 LJIIL(EnumC1736950vIj enumC1736950vIj, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1737770vK3) next).LIZJ == enumC1736950vIj) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C1737770vK3) next;
    }

    public static final EditImage LJIILIIL(EnumC1736950vIj enumC1736950vIj, List list) {
        Object obj;
        EditImageEffectImgCreatorData editImageEffectImgCreatorData;
        Iterator it2 = list.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            EditImage editImage = (EditImage) next;
            if (editImage != null && (editImageEffectImgCreatorData = editImage.effectImgCreatorData) != null) {
                obj = editImageEffectImgCreatorData.iconCategoryType;
            }
            if (obj == enumC1736950vIj) {
                obj = next;
                break;
            }
        }
        return (EditImage) obj;
    }

    public static final C1737880vKE LJIILJJIL(EnumC1736950vIj enumC1736950vIj, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1737880vKE) next).LIZIZ == enumC1736950vIj) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C1737880vKE) next;
    }

    public static final C1156280gCA LJIJJLI(C1737830vK9 c1737830vK9, MobileEffectResponse mobileEffectResponse) {
        C1737910vKH.LIZJ(c1737830vK9, new C1738220vKm("UpdateEffectResult.FailUploadEffect", mobileEffectResponse.errorCode, mobileEffectResponse.message));
        return new C1156280gCA(Integer.valueOf(mobileEffectResponse.errorCode), new Throwable("fail to publish effect"));
    }

    public static final String LJIL(String str, String str2) {
        String str3 = File.separator;
        if (u.LJIIZILJ(str, str3, false) && u.LJJIIJZLJL(str2, str3, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2.substring(str3.length()));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!u.LJIIZILJ(str, str3, false) && !u.LJJIIJZLJL(str2, str3, false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str3);
            sbLIZ2.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJJ(com.ss.android.ugc.aweme.prop.mobileefffect.EditImage r15, X.InterfaceC1364105Vn<? super java.lang.String> r16) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1737900vKG.LJJ(com.ss.android.ugc.aweme.prop.mobileefffect.EditImage, X.05Vn):java.lang.Object");
    }

    public static final boolean LJJIIJ(List list, boolean z) {
        if (z) {
            return LJJIIJZLJL(EnumC1736950vIj.EFFECT_ICON_FEMALE, list);
        }
        boolean zLJJIIJZLJL = LJJIIJZLJL(EnumC1736950vIj.EFFECT_ICON_FEMALE, list);
        boolean zLJJIIJZLJL2 = LJJIIJZLJL(EnumC1736950vIj.EFFECT_ICON_MALE, list);
        if (zLJJIIJZLJL && zLJJIIJZLJL2) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJZLJL(EnumC1736950vIj enumC1736950vIj, List<C1737770vK3> list) {
        String str;
        C1737770vK3 c1737770vK3LJIIL = LJIIL(enumC1736950vIj, list);
        if (c1737770vK3LJIIL != null && (str = c1737770vK3LJIIL.LIZIZ) != null) {
            return C123100dR.LIZ(str);
        }
        return false;
    }

    public static final boolean LJJIIZI(List list, boolean z) {
        if (list.isEmpty()) {
            return false;
        }
        if (z) {
            return LJJIJ(EnumC1736950vIj.EFFECT_ICON_FEMALE, list);
        }
        if (list.isEmpty()) {
            return false;
        }
        boolean zLJJIJ = LJJIJ(EnumC1736950vIj.EFFECT_ICON_FEMALE, list);
        boolean zLJJIJ2 = LJJIJ(EnumC1736950vIj.EFFECT_ICON_MALE, list);
        if (!zLJJIJ || !zLJJIJ2) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJ(EnumC1736950vIj enumC1736950vIj, List<C1737880vKE> list) {
        String str;
        if (list.isEmpty()) {
            return false;
        }
        C1737880vKE c1737880vKELJIILJJIL = LJIILJJIL(enumC1736950vIj, list);
        if (c1737880vKELJIILJJIL != null) {
            str = c1737880vKELJIILJJIL.LIZ;
        } else {
            str = null;
        }
        return C123100dR.LIZ(str);
    }

    public static final boolean LJJIJIIJI(List list, boolean z) {
        if (list.isEmpty()) {
            return false;
        }
        if (z) {
            return LJJIJIIJIL(EnumC1736950vIj.EFFECT_ICON_FEMALE, list);
        }
        if (list.isEmpty()) {
            return false;
        }
        boolean zLJJIJIIJIL = LJJIJIIJIL(EnumC1736950vIj.EFFECT_ICON_FEMALE, list);
        boolean zLJJIJIIJIL2 = LJJIJIIJIL(EnumC1736950vIj.EFFECT_ICON_MALE, list);
        if (!zLJJIJIIJIL || !zLJJIJIIJIL2) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJIL(EnumC1736950vIj enumC1736950vIj, List<EditImage> list) {
        EditImage editImageLJIILIIL;
        Uri uri;
        String path;
        if (list.isEmpty() || (editImageLJIILIIL = LJIILIIL(enumC1736950vIj, list)) == null || (uri = editImageLJIILIIL.url) == null || (path = uri.getPath()) == null) {
            return false;
        }
        return C123100dR.LIZ(path);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf A[PHI: r2
      0x00bf: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:58:0x00bd, B:56:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4 A[PHI: r1
      0x00d4: PHI (r1v22 java.lang.String) = (r1v17 java.lang.String), (r1v16 java.lang.String), (r1v23 java.lang.String) binds: [B:70:0x00e4, B:65:0x00d2, B:37:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0LAB LJI(com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData r7, X.EnumC1736950vIj r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1737900vKG.LJI(com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData, X.0vIj, java.lang.String):X.0LAB");
    }

    public static final boolean LJIIIZ(List list, List list2, boolean z) {
        if (z) {
            return LJIIJ(EnumC1736950vIj.EFFECT_ICON_FEMALE, list, list2);
        }
        if (list.size() != list2.size()) {
            return true;
        }
        boolean zLJIIJ = LJIIJ(EnumC1736950vIj.EFFECT_ICON_FEMALE, list, list2);
        boolean zLJIIJ2 = LJIIJ(EnumC1736950vIj.EFFECT_ICON_MALE, list, list2);
        if (zLJIIJ || zLJIIJ2) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJ(EnumC1736950vIj enumC1736950vIj, List<EditImage> list, List<C1737770vK3> list2) {
        EditImage editImageLJIILIIL;
        if (LJIIL(enumC1736950vIj, list2) == null || (editImageLJIILIIL = LJIILIIL(enumC1736950vIj, list)) == null) {
            return true;
        }
        return !Intrinsics.LJFF(r2.LIZ, editImageLJIILIIL.url.getPath());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJJI(android.net.Uri r7, java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            boolean r0 = r9 instanceof X.C09K9
            if (r0 == 0) goto L80
            r6 = r9
            X.09K9 r6 = (X.C09K9) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L93
            X.0VSJ r4 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto L86
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2e:
            X.C155000ia.LIZIZ(r2)
            int r0 = r8.length()
            if (r0 != 0) goto L3d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L3d:
            X.0VSJ r4 = X.C2354709Kn.LJFF(r8, r1)
            if (r4 != 0) goto L49
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L49:
            r6.LL = r4
            r6.LLILLL = r1
            X.1DEt r3 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r3.<init>(r1, r0)
            r3.LJIJJ()
            X.0kl3 r2 = X.C1331660kl2.LJI(r7)
            r0 = 162(0xa2, float:2.27E-43)
            r2.LJIIIIZZ = r0
            r2.LJIIIZ = r0
            X.0kve r0 = X.EnumC1338240kve.CENTER
            r2.LJJ = r0
            X.0200 r1 = new X.0200
            r0 = 0
            r1.<init>(r3, r0)
            r2.LJJII(r1)
            java.lang.Object r2 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L7d
            X.C099Q.LIZJ(r6)
        L7d:
            if (r2 != r5) goto L24
            return r5
        L80:
            X.09K9 r6 = new X.09K9
            r6.<init>(r9)
            goto L12
        L86:
            r1 = 100
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            boolean r0 = X.C1319770kRr.LJ(r1, r0, r2, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1737900vKG.LJJI(android.net.Uri, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final boolean LJJII(List list, List list2, boolean z) {
        if (list2.isEmpty() || list.isEmpty()) {
            return false;
        }
        if (z) {
            return LJJIII(EnumC1736950vIj.EFFECT_ICON_FEMALE, list, list2);
        }
        if (list2.isEmpty() || list.isEmpty()) {
            return false;
        }
        boolean zLJJIII = LJJIII(EnumC1736950vIj.EFFECT_ICON_FEMALE, list, list2);
        boolean zLJJIII2 = LJJIII(EnumC1736950vIj.EFFECT_ICON_MALE, list, list2);
        if (!zLJJIII || !zLJJIII2) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIII(EnumC1736950vIj enumC1736950vIj, List<C1737770vK3> list, List<C1737880vKE> list2) {
        C1737880vKE c1737880vKELJIILJJIL;
        C1737770vK3 c1737770vK3LJIIL;
        if (list2.isEmpty() || list.isEmpty() || (c1737880vKELJIILJJIL = LJIILJJIL(enumC1736950vIj, list2)) == null || (c1737770vK3LJIIL = LJIIL(enumC1736950vIj, list)) == null) {
            return false;
        }
        boolean zLIZ = C123100dR.LIZ(c1737880vKELJIILJJIL.LIZ);
        boolean zLJFF = Intrinsics.LJFF(c1737880vKELJIILJJIL.LIZJ, c1737770vK3LJIIL.LIZ);
        if (!zLIZ || !zLJFF) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIZ(EnumC1736950vIj enumC1736950vIj, List<EditImage> list, List<C1737880vKE> list2) {
        C1737880vKE c1737880vKELJIILJJIL;
        EditImage editImageLJIILIIL;
        if (list2.isEmpty() || list.isEmpty() || (c1737880vKELJIILJJIL = LJIILJJIL(enumC1736950vIj, list2)) == null || (editImageLJIILIIL = LJIILIIL(enumC1736950vIj, list)) == null) {
            return false;
        }
        boolean zLIZ = C123100dR.LIZ(c1737880vKELJIILJJIL.LIZ);
        boolean zLJFF = Intrinsics.LJFF(c1737880vKELJIILJJIL.LIZJ, editImageLJIILIIL.url.getPath());
        if (!zLIZ || !zLJFF) {
            return false;
        }
        return true;
    }

    public static void LJIIIIZZ(C19EG c19eg, TokenCert tokenCert, final InterfaceC1631620sYq interfaceC1631620sYq, boolean z, int i) {
        AFwS215S0000000_26 aFwS215S0000000_26;
        AFwS215S0000000_26 aFwS215S0000000_262;
        final boolean z2 = z;
        AFwS215S0000000_26 aFwS215S0000000_263 = null;
        if ((i & 8) != 0) {
            aFwS215S0000000_26 = AFwS215S0000000_26.get$arr$(248);
        } else {
            aFwS215S0000000_26 = null;
        }
        if ((i & 16) != 0) {
            aFwS215S0000000_262 = AFwS215S0000000_26.get$arr$(249);
        } else {
            aFwS215S0000000_262 = null;
        }
        if ((i & 32) != 0) {
            aFwS215S0000000_263 = AFwS215S0000000_26.get$arr$(250);
        }
        if ((i & 64) != 0) {
            z2 = true;
        }
        C540290LGx.LJ(C540290LGx.LIZ, c19eg, null, new C0LH5() { // from class: X.0Kwe
            /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
            @Override // X.C0LH5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int[] r4, java.lang.String[] r5) {
                /*
                    r3 = this;
                    boolean r0 = X.C533930Kwp.LIZ(r4)
                    r2 = 1
                    if (r0 != 0) goto L1e
                    boolean r0 = r2
                    if (r0 == 0) goto L28
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r0 = 34
                    if (r1 < r0) goto L28
                    X.0LGY r0 = X.C0LGY.LIZ
                    r0.getClass()
                    java.lang.String r0 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
                    boolean r0 = X.C0LGY.LIZLLL(r0)
                    if (r0 == 0) goto L28
                L1e:
                    X.0sYq<java.lang.Boolean, java.lang.String[], int[], kotlin.Unit> r1 = r1
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    r1.invoke(r0, r5, r4)
                    return
                L28:
                    r2 = 0
                    goto L1e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C533820Kwe.LIZ(int[], java.lang.String[]):void");
            }
        }, aFwS215S0000000_26, aFwS215S0000000_262, aFwS215S0000000_263, null, null, false, false, false, false, false, null, null, tokenCert, false, 94146);
    }

    public static Object LJJIFFI(CKEDraftInfo cKEDraftInfo, String str, String str2, List list, EffectHint effectHint, boolean z, int i, boolean z2, String str3, Boolean bool, Integer num, CKEDraftExtraInfo cKEDraftExtraInfo, InterfaceC1364105Vn interfaceC1364105Vn, int i2) throws Throwable {
        CKEDraftExtraInfo cKEDraftExtraInfo2 = cKEDraftExtraInfo;
        Integer num2 = num;
        Boolean bool2 = bool;
        String str4 = str3;
        boolean z3 = z2;
        boolean z4 = z;
        int i3 = i;
        String str5 = str;
        if ((i2 & 2) != 0) {
            str5 = null;
        }
        if ((i2 & 32) != 0) {
            z4 = false;
        }
        if ((i2 & 64) != 0) {
            i3 = 0;
        }
        if ((i2 & 128) != 0) {
            z3 = true;
        }
        if ((i2 & 256) != 0) {
            str4 = null;
        }
        if ((i2 & 512) != 0) {
            bool2 = null;
        }
        if ((i2 & 1024) != 0) {
            num2 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            cKEDraftExtraInfo2 = null;
        }
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1737160vJ4(i3, cKEDraftExtraInfo2, cKEDraftInfo, effectHint, bool2, num2, str2, str5, str4, list, null, z3, z4));
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }
}
