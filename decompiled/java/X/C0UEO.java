package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import webcast.data.EffectStruct;
import webcast.data.UrlDataStruct;

/* JADX INFO: renamed from: X.0UEO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEO {
    public static C0VSJ LIZ;

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

    public static Effect LIZIZ(LiveEffect liveEffect) {
        Effect effect = liveEffect.LIZJ;
        if (effect != null) {
            return effect;
        }
        Effect effect2 = new Effect();
        effect2.setIconUrl(LJII(liveEffect.getIcon()));
        effect2.setEffectId(String.valueOf(liveEffect.getEffectId()));
        effect2.setId(liveEffect.LLJI());
        effect2.setResourceId(liveEffect.getResourceId());
        effect2.setUnzipPath(liveEffect.getFilePath());
        effect2.setZipPath(liveEffect.LLIILZL());
        effect2.setHint(liveEffect.LIZIZ());
        effect2.setHintIcon(LJII(liveEffect.LLJJLIIIJLLLLLLLZ()));
        effect2.setDownloaded(liveEffect.LJIJJLI());
        effect2.setTags(liveEffect.getTags());
        effect2.setTagsUpdatedAt(liveEffect.LJLJJL());
        effect2.setName(liveEffect.getName());
        effect2.setSource(liveEffect.getSource());
        effect2.setEffect_type(liveEffect.LJJL());
        String strLJJLIIIJL = liveEffect.LJJLIIIJL();
        if (strLJJLIIIJL != null) {
            effect2.setDesigner_id(strLJJLIIIJL);
        }
        effect2.setChildren(liveEffect.LIZ());
        effect2.setPtime(liveEffect.LJLLLLLL());
        effect2.setPanel(liveEffect.getPanel());
        effect2.setExtra(liveEffect.getExtra());
        String strLJJIII = liveEffect.LJJIII();
        if (strLJJIII != null) {
            effect2.setSdkExtra(strLJJIII);
        }
        effect2.setFileUrl(LJII(liveEffect.getFileUrl()));
        effect2.setDevicePlatform(liveEffect.getDevicePlatform());
        effect2.setParent(liveEffect.getParent());
        effect2.setMusic(liveEffect.getMusic());
        effect2.setSchema(liveEffect.getSchema());
        effect2.setBusiness(liveEffect.LJLJL());
        effect2.setDesignerEncryptedId(liveEffect.LLFFF());
        effect2.setAdRawData(liveEffect.LLILZLL());
        effect2.setBindIds(liveEffect.LJJZZIII());
        effect2.setGradeKey(liveEffect.Wp());
        effect2.setComposerParams(liveEffect.LJLZ());
        effect2.setHintFile(LJII(liveEffect.LLIIJLIL()));
        effect2.setHintFileFormat(liveEffect.LJL());
        effect2.setChallenge(liveEffect.LJJJLIIL());
        effect2.setOriginal_effect_id(liveEffect.LLFZ());
        effect2.setTrans_file_url(LJII(liveEffect.LLJILJILJ()));
        effect2.setModel_names_sec(liveEffect.LJLJJLL());
        effect2.setRequirements_sec(liveEffect.LJLLLL());
        effect2.setTypes_sec(liveEffect.LJLLJ());
        return effect2;
    }

    public static UrlModel LIZJ(UrlDataStruct urlDataStruct) {
        if (urlDataStruct != null && urlDataStruct.uri != null && urlDataStruct.urlList != null) {
            UrlModel urlModel = new UrlModel();
            String str = urlDataStruct.uri;
            if (str != null && !str.isEmpty()) {
                urlModel.setUri(urlDataStruct.uri);
            } else if (urlDataStruct.urlList.isEmpty()) {
                urlModel.setUri("empty url");
            } else {
                urlModel.setUri((String) ListProtector.get(urlDataStruct.urlList, 0));
            }
            urlModel.setUrlList(urlDataStruct.urlList);
            return urlModel;
        }
        return new UrlModel();
    }

    public static LiveEffect LIZLLL(Effect effect) {
        if (LiveEffectStructureOptSetting.INSTANCE.enable()) {
            C0UEP c0uep = new C0UEP();
            c0uep.LIZJ = effect;
            if (effect != null) {
                try {
                    String effectId = effect.getEffectId();
                    if (effectId != null) {
                        c0uep.LJFF = CastLongProtector.parseLong(effectId);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            LJIIJJI(c0uep, c0uep.getExtra());
            LJIIL(c0uep, c0uep.LJJIII());
            return c0uep;
        }
        LiveEffectOld liveEffectOld = new LiveEffectOld();
        if (effect != null) {
            liveEffectOld.LIZJ = effect;
            liveEffectOld.LLLIZZ(LJFF(effect.getIconUrl()));
            try {
                liveEffectOld.LLIIZ(CastLongProtector.parseLong(effect.getEffectId()));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            liveEffectOld.LJFF = effect.getId();
            liveEffectOld.LJI = effect.getResourceId();
            liveEffectOld.LJIJJLI = effect.getUnzipPath();
            liveEffectOld.LLD = effect.getGradeKey();
            liveEffectOld.LJJIIZI = effect.getZipPath();
            liveEffectOld.LJIJI = effect.getHint();
            liveEffectOld.LJIJJ = LJFF(effect.getHintIcon());
            liveEffectOld.LJJJJIZL = effect.isDownloaded();
            liveEffectOld.LLLJIL(effect.getTags());
            liveEffectOld.LJJJJI = effect.getTagsUpdatedAt();
            liveEffectOld.LLLJL(effect.getTypes());
            effect.getTypes_sec();
            liveEffectOld.LLIIII = liveEffectOld.LLIIII;
            liveEffectOld.LLLJ(effect.getName());
            effect.getModelNames();
            liveEffectOld.LLIFFJFJJ = effect.getModel_names_sec();
            liveEffectOld.LJLJL = effect.getSource();
            liveEffectOld.LJLJLJ = effect.getRequirements();
            liveEffectOld.LLII = effect.getRequirements_sec();
            liveEffectOld.LJLJLLL = effect.getEffect_type();
            String designerId = effect.getDesignerId();
            if (designerId == null) {
                designerId = "";
            }
            liveEffectOld.LJLLILLLL = designerId;
            liveEffectOld.LJLL = effect.getChildren();
            liveEffectOld.LJLLI = effect.getPtime();
            liveEffectOld.LJJLJ(effect.getPanel());
            liveEffectOld.LIZJ = liveEffectOld.LIZJ;
            liveEffectOld.setExtra(effect.getExtra());
            liveEffectOld.LLIIJI = effect.getSdkExtra();
            LJIIJJI(liveEffectOld, liveEffectOld.getExtra());
            LJIIL(liveEffectOld, liveEffectOld.LLIIJI);
        }
        return liveEffectOld;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LiveEffect LJ(EffectStruct effectStruct) {
        List<String> listLIZ;
        List<String> listLIZ2;
        Effect effect;
        long j;
        String str;
        List<String> listLIZ3;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        if (LiveEffectStructureOptSetting.INSTANCE.enable()) {
            C0UEP c0uep = new C0UEP();
            String str2 = null;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            Object[] objArr17 = 0;
            Object[] objArr18 = 0;
            Object[] objArr19 = 0;
            Object[] objArr20 = 0;
            Object[] objArr21 = 0;
            Object[] objArr22 = 0;
            Object[] objArr23 = 0;
            Object[] objArr24 = 0;
            Object[] objArr25 = 0;
            Object[] objArr26 = 0;
            Object[] objArr27 = 0;
            Object[] objArr28 = 0;
            Object[] objArr29 = 0;
            Object[] objArr30 = 0;
            Object[] objArr31 = 0;
            Object[] objArr32 = 0;
            Object[] objArr33 = 0;
            Object[] objArr34 = 0;
            Object[] objArr35 = 0;
            Object[] objArr36 = 0;
            Object[] objArr37 = 0;
            Object[] objArr38 = 0;
            Object[] objArr39 = 0;
            Object[] objArr40 = 0;
            Object[] objArr41 = 0;
            Object[] objArr42 = 0;
            Object[] objArr43 = 0;
            Object[] objArr44 = 0;
            Object[] objArr45 = 0;
            Object[] objArr46 = 0;
            Object[] objArr47 = 0;
            Object[] objArr48 = 0;
            Object[] objArr49 = 0;
            Object[] objArr50 = 0;
            Object[] objArr51 = 0;
            Object[] objArr52 = 0;
            Object[] objArr53 = 0;
            Object[] objArr54 = 0;
            Object[] objArr55 = 0;
            Object[] objArr56 = 0;
            Object[] objArr57 = 0;
            Object[] objArr58 = 0;
            Object[] objArr59 = 0;
            Object[] objArr60 = 0;
            Object[] objArr61 = 0;
            Object[] objArr62 = 0;
            Object[] objArr63 = 0;
            if (effectStruct != null) {
                long j2 = 0;
                int i2 = -1;
                effect = new Effect(objArr63 == true ? 1 : 0, objArr62 == true ? 1 : 0, objArr61 == true ? 1 : 0, objArr60 == true ? 1 : 0, objArr59 == true ? 1 : 0, objArr58 == true ? 1 : 0, objArr57 == true ? 1 : 0, objArr56 == true ? 1 : 0, objArr55 == true ? 1 : 0, objArr54 == true ? 1 : 0, i, objArr53 == true ? 1 : 0, objArr52 == true ? 1 : 0, objArr51 == true ? 1 : 0, objArr50 == true ? 1 : 0, objArr49 == true ? 1 : 0, objArr48 == true ? 1 : 0, objArr47 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr46 == true ? 1 : 0, objArr45 == true ? 1 : 0, objArr44 == true ? 1 : 0, objArr43 == true ? 1 : 0, objArr42 == true ? 1 : 0, objArr41 == true ? 1 : 0, objArr40 == true ? 1 : 0, objArr39 == true ? 1 : 0, objArr38 == true ? 1 : 0, objArr37 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr36 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr35 == true ? 1 : 0, objArr34 == true ? 1 : 0, j2, objArr33 == true ? 1 : 0, objArr32 == true ? 1 : 0, j2, objArr31 == true ? 1 : 0, objArr30 == true ? 1 : 0, objArr29 == true ? 1 : 0, objArr28 == true ? 1 : 0, objArr27 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr26 == true ? 1 : 0, objArr25 == true ? 1 : 0, objArr24 == true ? 1 : 0, objArr23 == true ? 1 : 0, objArr22 == true ? 1 : 0, objArr21 == true ? 1 : 0, objArr20 == true ? 1 : 0, objArr19 == true ? 1 : 0, objArr18 == true ? 1 : 0, j2, objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, j2, j2, objArr14 == true ? 1 : 0, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i2, i2, 15, objArr9 == true ? 1 : 0);
                effect.setIconUrl(LIZJ(effectStruct.iconUrl));
                effect.setEffectId(effectStruct.effectId);
                effect.setId(effectStruct.id);
                effect.setResourceId(effectStruct.resourceId);
                effect.setUnzipPath(LJIIIIZZ(effectStruct));
                effect.setZipPath(LJIIIZ(effectStruct));
                effect.setHint(effectStruct.hint);
                effect.setHintIcon(LIZJ(effectStruct.hintIcon));
                effect.setDownloaded(false);
                effect.setTags(effectStruct.tags);
                effect.setTagsUpdatedAt(effectStruct.tagsUpdatedAt);
                List<String> list = effectStruct.typesSec;
                C0UES c0ues = C0UER.LIZ;
                if (c0ues == null || (listLIZ3 = C0UET.LIZ(c0ues, list)) == null) {
                    listLIZ3 = C13BV.INSTANCE;
                }
                effect.setTypes(listLIZ3);
                effect.setName(effectStruct.name);
                effect.setSource(effectStruct.source);
                effect.setEffect_type(effectStruct.effectType);
                effect.setDesigner_id(effectStruct.designerId);
                effect.setChildren(effectStruct.children);
                effect.setPtime(effectStruct.ptime);
                effect.setPanel(effectStruct.panel);
                effect.setExtra(effectStruct.extra);
                effect.setSdkExtra(effectStruct.sdkExtra);
                effect.setFileUrl(LIZJ(effectStruct.fileUrl));
                effect.setDevicePlatform(effectStruct.devicePlatform);
                effect.setParent(effectStruct.parent);
                effect.setMusic(effectStruct.music);
                effect.setSchema(effectStruct.schema);
                effect.setBusiness(effectStruct.isBusi);
                effect.setDesignerEncryptedId(effectStruct.designerEncryptedId);
                effect.setAdRawData(effectStruct.adRawData);
                effect.setBindIds(effectStruct.bindIds);
                effect.setGradeKey(effectStruct.gradeKey);
                effect.setComposerParams(effectStruct.composerParams);
                effect.setHintFile(LIZJ(effectStruct.hintFile));
                effect.setHintFileFormat(effectStruct.hintFileFormat);
                effect.setChallenge(effectStruct.challenge);
                effect.setOriginal_effect_id(effectStruct.originalEffectId);
                effect.setTrans_file_url(LIZJ(effectStruct.transFileUrl));
                effect.setModel_names_sec(effectStruct.modelNamesSec);
                effect.setRequirements_sec(effectStruct.requirementsSec);
                effect.setTypes_sec(effectStruct.typesSec);
            } else {
                effect = null;
            }
            c0uep.LIZJ = effect;
            if (effectStruct == null) {
                j = -1;
            } else {
                try {
                    String str3 = effectStruct.effectId;
                    if (str3 != null) {
                        c0uep.LJFF = CastLongProtector.parseLong(str3);
                    }
                    j = effectStruct.fromAppId;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c0uep.LIZIZ = j;
            if (effectStruct != null) {
                str = effectStruct.extra;
            } else {
                str = null;
            }
            LJIIJJI(c0uep, str);
            if (effectStruct != null) {
                str2 = effectStruct.sdkExtra;
            }
            LJIIL(c0uep, str2);
            return c0uep;
        }
        LiveEffectOld liveEffectOld = new LiveEffectOld();
        if (effectStruct != null) {
            liveEffectOld.LLLIZZ(LJI(effectStruct.iconUrl));
            try {
                liveEffectOld.LLIIZ(CastLongProtector.parseLong(effectStruct.effectId));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            liveEffectOld.LIZIZ = effectStruct.fromAppId;
            liveEffectOld.LJFF = effectStruct.id;
            liveEffectOld.LJI = effectStruct.resourceId;
            liveEffectOld.LJIJJLI = LJIIIIZZ(effectStruct);
            liveEffectOld.LJJIIZI = LJIIIZ(effectStruct);
            liveEffectOld.LJIJI = effectStruct.hint;
            liveEffectOld.LJIJJ = LJI(effectStruct.hintIcon);
            liveEffectOld.LJJJJIZL = false;
            liveEffectOld.LLLJIL(effectStruct.tags);
            liveEffectOld.LJJJJI = effectStruct.tagsUpdatedAt;
            List<String> list2 = effectStruct.typesSec;
            C0UES c0ues2 = C0UER.LIZ;
            if (c0ues2 == null || (listLIZ = C0UET.LIZ(c0ues2, list2)) == null) {
                listLIZ = C13BV.INSTANCE;
            }
            liveEffectOld.LLLJL(listLIZ);
            liveEffectOld.LLLJ(effectStruct.name);
            liveEffectOld.LJLJL = effectStruct.source;
            List<String> list3 = effectStruct.requirementsSec;
            C0UES c0ues3 = C0UER.LIZ;
            if (c0ues3 == null || (listLIZ2 = C0UET.LIZ(c0ues3, list3)) == null) {
                listLIZ2 = C13BV.INSTANCE;
            }
            liveEffectOld.LJLJLJ = listLIZ2;
            liveEffectOld.LJLJLLL = effectStruct.effectType;
            String str4 = effectStruct.designerId;
            if (str4 == null) {
                str4 = "";
            }
            liveEffectOld.LJLLILLLL = str4;
            liveEffectOld.LJLL = effectStruct.children;
            liveEffectOld.LJLLI = effectStruct.ptime;
            liveEffectOld.LJJLJ(effectStruct.panel);
            liveEffectOld.LJLLJ = LJI(effectStruct.fileUrl);
            liveEffectOld.LJLLL = effectStruct.devicePlatform;
            liveEffectOld.LJLLLL = effectStruct.parent;
            liveEffectOld.LJLLLLLL = effectStruct.music;
            liveEffectOld.LJLZ = effectStruct.schema;
            liveEffectOld.LJZ = effectStruct.isBusi;
            liveEffectOld.LJZI = effectStruct.designerEncryptedId;
            liveEffectOld.LJZL = effectStruct.adRawData;
            liveEffectOld.LL = effectStruct.bindIds;
            liveEffectOld.LLD = effectStruct.gradeKey;
            liveEffectOld.LLF = effectStruct.composerParams;
            liveEffectOld.LLFF = LJI(effectStruct.hintFile);
            String str5 = effectStruct.modelNamesSec;
            C0UES c0ues4 = C0UER.LIZ;
            if (c0ues4 != null) {
                c0ues4.decrypt(str5);
            }
            liveEffectOld.LLFFF = effectStruct.hintFileFormat;
            liveEffectOld.LLFII = effectStruct.challenge;
            liveEffectOld.LLFZ = effectStruct.originalEffectId;
            liveEffectOld.LLI = LJI(effectStruct.transFileUrl);
            liveEffectOld.LLIFFJFJJ = effectStruct.modelNamesSec;
            liveEffectOld.LLII = effectStruct.requirementsSec;
            liveEffectOld.LLIIII = liveEffectOld.LLIIII;
            liveEffectOld.setExtra(effectStruct.extra);
            liveEffectOld.LLIIJI = effectStruct.sdkExtra;
            liveEffectOld.LIZJ = LIZIZ(liveEffectOld);
            LJIIJJI(liveEffectOld, liveEffectOld.getExtra());
            LJIIL(liveEffectOld, liveEffectOld.LLIIJI);
        }
        return liveEffectOld;
    }

    public static com.bytedance.android.live.base.model.UrlModel LJFF(UrlModel urlModel) {
        if (urlModel != null && urlModel.getUri() != null) {
            com.bytedance.android.live.base.model.UrlModel urlModel2 = new com.bytedance.android.live.base.model.UrlModel();
            urlModel2.uri = urlModel.getUri();
            urlModel2.urlList = urlModel.getUrlList();
            return urlModel2;
        }
        return new com.bytedance.android.live.base.model.UrlModel();
    }

    public static com.bytedance.android.live.base.model.UrlModel LJI(UrlDataStruct urlDataStruct) {
        if (urlDataStruct == null) {
            return new com.bytedance.android.live.base.model.UrlModel();
        }
        com.bytedance.android.live.base.model.UrlModel urlModel = new com.bytedance.android.live.base.model.UrlModel();
        urlModel.uri = urlDataStruct.uri;
        urlModel.urlList = urlDataStruct.urlList;
        return urlModel;
    }

    public static UrlModel LJII(com.bytedance.android.live.base.model.UrlModel urlModel) {
        if (urlModel != null && urlModel.uri != null && urlModel.urlList != null) {
            UrlModel urlModel2 = new UrlModel();
            String str = urlModel.uri;
            if (str != null && !str.isEmpty()) {
                urlModel2.setUri(urlModel.uri);
            } else if (urlModel.urlList.isEmpty()) {
                urlModel2.setUri("empty url");
            } else {
                urlModel2.setUri((String) ListProtector.get(urlModel.urlList, 0));
            }
            urlModel2.setUrlList(urlModel.urlList);
            return urlModel2;
        }
        return new UrlModel();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ(webcast.data.EffectStruct r3) {
        /*
            X.0VSJ r0 = X.C0UEO.LIZ
            if (r0 != 0) goto L17
            android.content.Context r0 = X.C497740JfY.LJII()
            if (r0 == 0) goto L2b
            X.0VSJ r2 = new X.0VSJ     // Catch: java.lang.Throwable -> L27
            java.io.File r1 = LIZ(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "effect"
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L27
            X.C0UEO.LIZ = r2     // Catch: java.lang.Throwable -> L27
        L17:
            X.0VSJ r0 = X.C0UEO.LIZ
            boolean r0 = r0.exists()
            if (r0 != 0) goto L24
            X.0VSJ r0 = X.C0UEO.LIZ
            r0.mkdirs()
        L24:
            X.0VSJ r0 = X.C0UEO.LIZ
            goto L2c
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2b:
            r0 = 0
        L2c:
            if (r0 == 0) goto L48
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r0.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            java.lang.String r0 = r3.id
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        L48:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UEO.LJIIIIZZ(webcast.data.EffectStruct):java.lang.String");
    }

    public static String LJIIIZ(EffectStruct effectStruct) {
        String strLJIIIIZZ = LJIIIIZZ(effectStruct);
        if (strLJIIIIZZ.length() <= 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIIIIZZ);
        sbLIZ.append(".zip");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIJ(n nVar, LiveEffect liveEffect) {
        List<LiveEffect.ComposerConfig> list = (List) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, GsonProtectorUtils.parse(new p(), nVar.LJJIIZ("beautyConfig").LJIL()).LJIILIIL().LJJIIZI("items"), new TypeToken<List<LiveEffect.ComposerConfig>>() { // from class: X.0UEQ
        }.getType());
        liveEffect.LJLJI(list);
        Iterator<LiveEffect.ComposerConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            liveEffect.LJJIJIIJIL().add(it2.next().tag);
        }
    }

    public static void LJIIJJI(LiveEffect liveEffect, String str) {
        if (!C2093608Ic.LJ(str)) {
            try {
                new p();
                n nVarLJIILIIL = p.LIZJ(str).LJIILIIL();
                if (nVarLJIILIIL.LJJIJIIJIL("ab_group")) {
                    liveEffect.LLIIJI(nVarLJIILIIL.LJJIIZ("ab_group").LJIIJJI());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("beauty_restore_by_ui_value")) {
                    liveEffect.LLJ(nVarLJIILIIL.LJJIIZ("beauty_restore_by_ui_value").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("beautyConfig")) {
                    LJIIJ(nVarLJIILIIL, liveEffect);
                }
                if (nVarLJIILIIL.LJJIJIIJIL("enable_gender_difference")) {
                    liveEffect.LJJJJJL(nVarLJIILIIL.LJJIIZ("enable_gender_difference").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("default")) {
                    liveEffect.LJJJLZIJ(Boolean.valueOf(nVarLJIILIIL.LJJIIZ("default").LJ()));
                } else {
                    liveEffect.LJJJLZIJ(Boolean.FALSE);
                }
                if (nVarLJIILIIL.LJJIJIIJIL("Review_original_frame")) {
                    liveEffect.LLFII(nVarLJIILIIL.LJJIIZ("Review_original_frame").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("effect_name_en")) {
                    liveEffect.LJJIFFI(nVarLJIILIIL.LJJIIZ("effect_name_en").LJIL());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("icon_insert")) {
                    liveEffect.LJJJLL(nVarLJIILIIL.LJJIIZ("icon_insert").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("is_dynamic_grade")) {
                    liveEffect.LLJL(nVarLJIILIIL.LJJIIZ("is_dynamic_grade").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("cohost_insert")) {
                    liveEffect.LJJLIIIJLJLI(nVarLJIILIIL.LJJIIZ("cohost_insert").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("multi_insert")) {
                    liveEffect.LJJIZ(nVarLJIILIIL.LJJIIZ("multi_insert").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("gift_sticker") && nVarLJIILIIL.LJJIIZ("gift_sticker").LJ()) {
                    liveEffect.LJJJJJ().addAll(Collections.singletonList(2));
                }
                if (nVarLJIILIIL.LJJIJIIJIL("quiz")) {
                    liveEffect.LJIIL(nVarLJIILIIL.LJJIIZ("quiz").LJIL());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("effect_preview")) {
                    liveEffect.LLJLLL(nVarLJIILIIL.LJJIIZ("effect_preview").LJIL());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("effect_recommend_start")) {
                    liveEffect.LLILZ(nVarLJIILIIL.LJJIIZ("effect_recommend_start").LJIIZILJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("effect_recommend_end")) {
                    liveEffect.LJIILL(nVarLJIILIIL.LJJIIZ("effect_recommend_end").LJIIZILJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("block_multiplayer")) {
                    liveEffect.LJLJJI(nVarLJIILIIL.LJJIIZ("block_multiplayer").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("is_safe_area")) {
                    liveEffect.LLJILJIL(nVarLJIILIIL.LJJIIZ("is_safe_area").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("action_schema")) {
                    liveEffect.LJZL(nVarLJIILIIL.LJJIIZ("action_schema").LJIL());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("is_greenscreen")) {
                    liveEffect.LLIIII(nVarLJIILIIL.LJJIIZ("is_greenscreen").LJ());
                }
                boolean z = true;
                if (nVarLJIILIIL.LJJIJIIJIL("not_multiguest_effect")) {
                    if (nVarLJIILIIL.LJJIIZ("not_multiguest_effect").LJ()) {
                        z = false;
                    }
                    liveEffect.LLIIIL(z);
                } else if (LiveEffectStructureOptSetting.INSTANCE.enable()) {
                    liveEffect.LLIIIL(true);
                }
                if (nVarLJIILIIL.LJJIJIIJIL("coexist_with_background")) {
                    liveEffect.LJJLIIIJJIZ(nVarLJIILIIL.LJJIIZ("coexist_with_background").LJIIJJI());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("enable_pan_gesture")) {
                    liveEffect.LJJIIZI(nVarLJIILIIL.LJJIIZ("enable_pan_gesture").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("disableEffectPreview")) {
                    liveEffect.LLIL(nVarLJIILIIL.LJJIIZ("disableEffectPreview").LJ());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("trade_change")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(liveEffect.getName());
                    sbLIZ.append(" : ");
                    sbLIZ.append(liveEffect.getEffectId());
                    sbLIZ.append(", grade: ");
                    sbLIZ.append(nVarLJIILIIL.LJJIIZ("trade_change").LJIIJJI());
                    C20441214yg.LIZIZ("EffectMonitor#Adaptive", C2188811AlT.LIZIZ(sbLIZ));
                    liveEffect.LLJIJIL(nVarLJIILIIL.LJJIIZ("trade_change").LJIIJJI());
                }
                if (nVarLJIILIIL.LJJIJIIJIL("en_beautyname")) {
                    liveEffect.LIZ = nVarLJIILIIL.LJJIIZ("en_beautyname").LJIL();
                }
                C767280U7y.LIZ(liveEffect);
                C767280U7y.LIZIZ(liveEffect);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJIIL(LiveEffect liveEffect, String str) {
        if (!C2093608Ic.LJ(str)) {
            try {
                liveEffect.LJIJJ((LiveEffect.StickerSDKExtra) C19748512Ol.LIZIZ.LJII(str, LiveEffect.StickerSDKExtra.class));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
