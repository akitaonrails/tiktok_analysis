package X;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusConfig;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusLabels;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusMedia;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusTimePeriod;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusTips;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.13V2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13V2 implements ISpecialPlusService {
    public static final C01GW<C13V2> LJIIL = C452501pT.LIZIZ(new C13V4());
    public SpecialPlusConfig LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public boolean LJI;
    public C13V3 LJII;
    public boolean LJIIIZ;
    public final C0CIR LIZ = new C0CIR();
    public final List<String> LJIIIIZZ = new ArrayList();
    public String LJIIJ = "";
    public final AtomicBoolean LJIIJJI = new AtomicBoolean(false);

    public final void LIZ() {
        if (((Boolean) C1E83.LJI.getValue()).booleanValue() && this.LJIIJJI.get()) {
            return;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = C304940BxM.LIZ();
            initCallBack();
        }
        boolean z = false;
        this.LIZLLL = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_quick_promo_plus_disappearance_optimization", true, false);
        boolean zLIZ = C1429780nJI.LIZ();
        this.LJ = zLIZ;
        if (!this.LIZLLL || !zLIZ) {
            try {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("enable_special_plus", false)) {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LIZJ = z;
        this.LJIIJJI.set(true);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final int getQuickPromoCount() {
        return this.LIZ.LIZ.getInt("quick_promo_count", 3);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final long getQuickPromoPlusDebutTime() {
        return this.LIZ.LIZ.getLong("quick_promo_plus_shown_time", 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.12Az, X.13V3] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void initCallBack() {
        ?? r1 = new C1434040nQA() { // from class: X.13V3
            @Override // X.C1434040nQA, X.InterfaceC19713512Az
            public final void onAppBackground() {
                C13V2 c13v2 = this.LL;
                if (c13v2.LJI) {
                    C0CIR c0cir = c13v2.LIZ;
                    c0cir.LIZ.storeLong("quick_promo_plus_app_terminated_time", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    this.LL.LIZ.LIZ.storeInt("last_os_process_id", Process.myPid());
                }
            }
        };
        this.LJII = r1;
        C19712912At.LIZ.LJ(r1);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isNeedShowSpecialPlusDirect() {
        SpecialPlusConfig specialPlusConfig;
        if (o.LJIIZILJ.LIZ()) {
            return false;
        }
        LIZ();
        if ((!this.LIZJ && (!this.LIZLLL || !this.LJ)) || (specialPlusConfig = this.LIZIZ) == null) {
            return false;
        }
        if (this.LIZ.LIZ.getInt("special_plus_showed_config_version", 0) == specialPlusConfig.getVersion()) {
            return shouldShowSpecialPlus();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean shouldResetTransformationsMap() {
        long j = 86400000;
        return !(this.LIZ.LIZ.getLong("effect_video_plus_counts_last_reset_time", 0L) / j == System.currentTimeMillis() / j);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean shouldShowQuickPromoPlusAuthor() {
        return this.LIZ.LIZ.getBoolean("quick_promo_author", true);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean shouldShowSpecialPlus() {
        SpecialPlusConfig specialPlusConfig;
        boolean z;
        long jCurrentTimeMillis;
        String unzipPath;
        int i;
        SpecialPlusTimePeriod[] validTime;
        long j;
        if (o.LJIIZILJ.LIZ()) {
            return false;
        }
        LIZ();
        if ((!this.LIZJ && (!this.LIZLLL || !this.LJ)) || (specialPlusConfig = this.LIZIZ) == null) {
            return false;
        }
        if (specialPlusConfig.getVersion() == this.LIZ.LIZ.getInt("special_plus_config_version", -1)) {
            C13V3 c13v3 = this.LJII;
            if (c13v3 != null) {
                C19712912At.LIZ.LJFF(c13v3);
            }
            return false;
        }
        SpecialPlusConfig specialPlusConfig2 = this.LIZIZ;
        if (specialPlusConfig2 != null && (validTime = specialPlusConfig2.getValidTime()) != null && validTime.length != 0) {
            jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            int length = validTime.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                SpecialPlusTimePeriod specialPlusTimePeriod = validTime[i2];
                long j2 = -1;
                try {
                    j = CastLongProtector.parseLong(specialPlusTimePeriod.getStart());
                    try {
                        j2 = CastLongProtector.parseLong(specialPlusTimePeriod.getEnd());
                    } catch (NumberFormatException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    j = -1;
                }
                if (j <= jCurrentTimeMillis && jCurrentTimeMillis <= j2) {
                    z = true;
                    break;
                }
                i2++;
            }
        } else {
            z = false;
            jCurrentTimeMillis = 0;
        }
        if (!z) {
            this.LIZ.LIZ.storeLong("quick_promo_plus_shown_time", 0L);
            C13V3 c13v32 = this.LJII;
            if (c13v32 != null) {
                C19712912At.LIZ.LJFF(c13v32);
            }
            return false;
        }
        C0CIR c0cir = this.LIZ;
        SpecialPlusConfig specialPlusConfig3 = this.LIZIZ;
        if (c0cir.LIZ.getInt("special_plus_showed_config_version", 0) != (specialPlusConfig3 != null ? specialPlusConfig3.getVersion() : 0)) {
            this.LIZ.LIZ.storeLong("quick_promo_plus_shown_time", 0L);
        }
        if ((this.LIZLLL || this.LJ) && this.LIZ.LIZ.getLong("quick_promo_plus_shown_time", 0L) != 0) {
            float f = jCurrentTimeMillis - this.LIZ.LIZ.getLong("quick_promo_plus_shown_time", 0L);
            SpecialPlusConfig specialPlusConfig4 = this.LIZIZ;
            if (f >= (specialPlusConfig4 != null ? specialPlusConfig4.getAppearance_period_in_hours() : 0.0f) * 3600) {
                C13V3 c13v33 = this.LJII;
                if (c13v33 != null) {
                    C19712912At.LIZ.LJFF(c13v33);
                }
                return false;
            }
        }
        if (this.LJ && this.LIZ.LIZ.getInt("quick_promo_count", 3) <= 0) {
            C13V3 c13v34 = this.LJII;
            if (c13v34 != null) {
                C19712912At.LIZ.LJFF(c13v34);
            }
            return false;
        }
        if (!this.LJ && (i = this.LIZ.LIZ.getInt("last_os_process_id", 0)) != 0) {
            if (i != Process.myPid()) {
                this.LJFF = this.LIZ.LIZ.getLong("quick_promo_plus_app_terminated_time", 0L);
            }
            long jCurrentTimeMillis2 = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - this.LJFF;
            SpecialPlusConfig specialPlusConfig5 = this.LIZIZ;
            if (jCurrentTimeMillis2 <= (specialPlusConfig5 != null ? specialPlusConfig5.getCool_down_period_in_hours() : 0.0f) * 3600) {
                return false;
            }
        }
        C1663560tOM.LIZ.getClass();
        SpecialPlusConfig specialPlusConfigLIZ = C304940BxM.LIZ();
        if (specialPlusConfigLIZ == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1663560tOM.LIZIZ);
        sbLIZ.append(File.separator);
        sbLIZ.append(u.LJIIZILJ(specialPlusConfigLIZ.getPlusIcon().getUrl(), ".webp", false) ? "special_plus_icon.webp" : "special_plus_icon.png");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!C2286708xd.LIZJ(strLIZIZ)) {
            return false;
        }
        String strLIZ = C08F1.LIZ(new C0VSJ(strLIZIZ));
        String md5 = specialPlusConfigLIZ.getPlusIcon().getMd5();
        if (TextUtils.isEmpty(md5) || !TextUtils.equals(strLIZ, md5)) {
            return false;
        }
        C0CIR c0cir2 = C1663560tOM.LIZJ;
        Effect effectLIZIZ = c0cir2.LIZIZ();
        if (effectLIZIZ == null || (unzipPath = effectLIZIZ.getUnzipPath()) == null) {
            unzipPath = "";
        }
        return C2286708xd.LIZJ(unzipPath) && c0cir2.LIZ.getInt("special_plus_effect_version", 0) == specialPlusConfigLIZ.getVersion();
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getEffectId() {
        SpecialPlusLabels labels;
        String[] effectIds;
        String str;
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        return (specialPlusConfig == null || (labels = specialPlusConfig.getLabels()) == null || (effectIds = labels.getEffectIds()) == null || effectIds.length == 0 || (str = effectIds[0]) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getIconType() {
        SpecialPlusMedia plusIcon;
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        if (specialPlusConfig == null || (plusIcon = specialPlusConfig.getPlusIcon()) == null) {
            return null;
        }
        return plusIcon.getUrl();
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final int getMaxTransformationsLimit() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_flip_shoot_icon_total_impression_per_day", true);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getResourceType() {
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        String resourceType = specialPlusConfig != null ? specialPlusConfig.getResourceType() : null;
        return (resourceType == null || resourceType.length() == 0) ? "effect" : a0.LJLIIIL(resourceType).toString().toLowerCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final List<String> getSpecialPlusEffectList() {
        SpecialPlusLabels labels;
        String[] eligibleEffectIds;
        List<String> listAsList;
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        return (specialPlusConfig == null || (labels = specialPlusConfig.getLabels()) == null || (eligibleEffectIds = labels.getEligibleEffectIds()) == null || (listAsList = Arrays.asList(eligibleEffectIds)) == null) ? C13BV.INSTANCE : listAsList;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getSpecialPlusTips() {
        SpecialPlusTips tips;
        String tryTip;
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        return (specialPlusConfig == null || (tips = specialPlusConfig.getTips()) == null || (tryTip = tips.getTryTip()) == null) ? "" : tryTip;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final int getTransformationsLimitPerEffect() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_flip_shoot_icon_effect_impression_per_day", true);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isEffectVideoPlusEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_flip_shoot_icon", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isEffectVideoPlusUnlimitedTransformations() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_flip_shoot_icon_unlimited_transformations", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isQuickPromoPlusDisappearOptimization() {
        return C1429780nJI.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isQuickPromoPlusEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_quick_promo_plus_disappearance_optimization", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusClicked() {
        LIZ();
        C0CIR c0cir = this.LIZ;
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        c0cir.LIZ.storeInt("special_plus_config_version", specialPlusConfig != null ? specialPlusConfig.getVersion() : 0);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusShowed() {
        LIZ();
        C0CIR c0cir = this.LIZ;
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        c0cir.LIZ.storeInt("special_plus_showed_config_version", specialPlusConfig != null ? specialPlusConfig.getVersion() : 0);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getEffectVideoPlusTab() {
        return this.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final List<String> getListOfPreviousAid() {
        return this.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isEffectVideoPlusShowed() {
        return this.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final HashMap<String, Integer> getTransformationsCountMap(String str) {
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            return this.LIZ.LIZ(str);
        }
        if (Intrinsics.LJFF(str, "homepage_follow")) {
            return this.LIZ.LIZ(str);
        }
        return new HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preDownloadSuperEntranceRes(android.content.Context r13) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13V2.preDownloadSuperEntranceRes(android.content.Context):void");
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void saveLastAid(String str) {
        ((ArrayList) this.LJIIIIZZ).add(str);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setEffectVideoPlusShowed(boolean z) {
        this.LJIIIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setEffectVideoPlusTab(String str) {
        this.LJIIJ = str;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setLastTransformationDate(long j) {
        this.LIZ.LIZ.storeLong("effect_video_plus_counts_last_reset_time", j);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setQuickPromoCount(int i) {
        this.LIZ.LIZ.storeInt("quick_promo_count", i);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setQuickPromoPlusDebutTime(long j) {
        this.LIZ.LIZ.storeLong("quick_promo_plus_shown_time", j);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setShouldShowQuickPromoPlusAuthor(boolean z) {
        this.LIZ.LIZ.storeBoolean("quick_promo_author", z);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusState(boolean z) {
        this.LJI = z;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isTransformationLimitHit(String str, String str2) {
        int iIntValue;
        boolean z;
        boolean z2;
        if (isEffectVideoPlusUnlimitedTransformations()) {
            return false;
        }
        if (shouldResetTransformationsMap()) {
            C0CIR c0cir = this.LIZ;
            c0cir.getClass();
            c0cir.LIZJ(new HashMap<>(), "homepage_hot");
            c0cir.LIZJ(new HashMap<>(), "homepage_follow");
        }
        HashMap<String, Integer> transformationsCountMap = getTransformationsCountMap(str2);
        Iterator<Integer> it2 = transformationsCountMap.values().iterator();
        int iIntValue2 = 0;
        while (it2.hasNext()) {
            iIntValue2 += it2.next().intValue();
        }
        Integer num = transformationsCountMap.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int maxTransformationsLimit = getMaxTransformationsLimit();
        int transformationsLimitPerEffect = getTransformationsLimitPerEffect();
        if (iIntValue2 >= maxTransformationsLimit) {
            z = true;
        } else {
            z = false;
        }
        if (iIntValue >= transformationsLimitPerEffect) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setTransformationsCountMap(HashMap<String, Integer> map, String str) {
        this.LIZ.LIZJ(map, str);
    }
}
