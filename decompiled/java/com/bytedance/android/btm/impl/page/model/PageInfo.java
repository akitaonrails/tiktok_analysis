package com.bytedance.android.btm.impl.page.model;

import X.C13LE;
import X.C18C5;
import X.C18CE;
import X.C18CK;
import X.C18CS;
import X.C18DA;
import X.C18DS;
import X.C18DT;
import X.C18DU;
import X.C18DV;
import X.C18DW;
import X.C18DX;
import X.C18DZ;
import X.C18E3;
import X.C18FN;
import X.C18IP;
import X.C1972007ny;
import X.C20330914gt;
import X.C20331014gu;
import X.C20331114gv;
import X.C20332214h6;
import X.C20332314h7;
import X.C20332414h8;
import X.C20332514h9;
import X.C20332614hA;
import X.C20332714hB;
import X.C20332814hC;
import X.C2095008Iq;
import X.C21242018Aw;
import X.C21247918Dd;
import X.C21248018De;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C786410Ut5;
import X.C801030VbZ;
import X.EnumC21244218Bs;
import X.EnumC21248118Df;
import X.EnumC21250718Ef;
import X.InterfaceC1294060jmO;
import X.InterfaceC2217461Bqa;
import android.os.SystemClock;
import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.api.cache.ISavable;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.ShowIdUpdateReason;
import com.bytedance.android.btm.impl.page.unknown.UnionBufferBtm;
import com.bytedance.android.btm.impl.page.unknown.UnionData;
import com.bytedance.android.btm.impl.setting.BtmSettingModel;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes33.dex */
public class PageInfo extends UnionData implements ISavable<PageInfo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final C18DZ Companion;
    public static final long serialVersionUID = 20211213;
    public String btmPre;
    public boolean btmPreIsToken;
    public boolean btmPreSetFromSourceBtmToken;
    public String classSimpleName;
    public boolean couldUpdateInstanceId;
    public long duration;
    public UnionBufferBtm earlierUnionBuffer;
    public boolean enterPage;
    public long enterTime;
    public Boolean firstShow;
    public boolean hasSendEnterPage;
    public int ignoreFirstResumeFlag;
    public final LazyNonNull instanceId$delegate;
    public boolean isBeforeFirstResume;
    public boolean isFirstPage;
    public String lastPageShowId;
    public long lastPauseTime;
    public long lastResumeTime;
    public transient String latestBtmId;
    public transient C21242018Aw latestBtmIdNode;
    public transient String latestPageBtmId;
    public transient C21242018Aw latestPageBtmIdNode;
    public boolean needUpdateShowIdWhenResume;
    public final LazyNonNull pageShowId$delegate;
    public transient C21242018Aw preBtmIdNode;
    public transient EnumC21244218Bs recoveryFrom;
    public boolean reuse;
    public String scene;
    public int step;
    public String unknownSourceBtmToken;
    public boolean updateBySourceBtmTokenInThisDisplay;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.18DZ] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(PageInfo.class, "instanceId", "getInstanceId()Ljava/lang/String;", 0);
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217371BqR, new C2217371BqR(PageInfo.class, "pageShowId", "getPageShowId()Ljava/lang/String;", 0)};
        Companion = new Object() { // from class: X.18DZ
        };
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getEnterPage$annotations() {
    }

    private final void monitorFirstPageResumeTime() {
        Long lLJIILIIL;
        if (this.isFirstPage && this.step == 1 && this.firstShow == null && (lLJIILIIL = C2095008Iq.LJIILIIL(BtmServiceImpl.INSTANCE.getLaunchIdExp())) != null) {
            if (this.enterTime - lLJIILIIL.longValue() > 15000) {
                C18CE.LJI(2108, this, getPageBtm(), null, new C18DX(), null, 184);
            }
        }
    }

    public final void fakeResume() {
        this.isBeforeFirstResume = false;
        this.firstShow = Boolean.TRUE;
        this.reuse = false;
        boolean z = C18E3.LIZ;
        if (C18E3.LIZ) {
            this.isFirstPage = true;
            C18E3.LIZ = false;
        }
        this.ignoreFirstResumeFlag = 2;
    }

    public final void onDestroy() {
    }

    public final void reset() {
        this.step = 1;
        this.btmPre = null;
        this.enterTime = 0L;
        this.duration = 0L;
        this.lastResumeTime = 0L;
        this.lastPauseTime = 0L;
        this.scene = "normal";
    }

    private final void generateInstanceId() {
        AtomicLong atomicLong = C801030VbZ.LIZ;
        setInstanceId(UUID.randomUUID().toString());
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "new_btm_show_id", Integer.valueOf(featureModelLIZJ.newBtmShowId));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : featureModelLIZJ.newBtmShowId;
        featureModelLIZJ.newBtmShowId = iIntValue;
        if (iIntValue == 1) {
            setPageShowId(C801030VbZ.LIZ(getInstanceId(), null));
        }
    }

    private final void generateShowId() {
        AtomicLong atomicLong = C801030VbZ.LIZ;
        setPageShowId(C801030VbZ.LIZ(getInstanceId(), getPageShowId()));
    }

    public PageInfo copy() {
        BcmPageInfo bcmPageInfoLIZ = PageInfoStack.Companion.LIZ().LIZ();
        copy(bcmPageInfoLIZ);
        return bcmPageInfoLIZ;
    }

    public final String getInstanceId() {
        return (String) this.instanceId$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final String getPageShowId() {
        return (String) this.pageShowId$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final boolean isFirstResumeV2() {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        return C18CS.LIZ.LIZIZ().LJIIIZ() == 1 ? this.isBeforeFirstResume || this.firstShow == null || this.reuse : this.isBeforeFirstResume;
    }

    public final boolean isFromBackground() {
        return !BtmServiceImpl.INSTANCE.getAppStatusObserver().LJJIJL(this.enterTime, Long.MAX_VALUE).isEmpty();
    }

    public String toString() {
        if (C18CS.LIZ.LIZLLL().LJIJI() == 1) {
            StringBuilder sb = new StringBuilder(512);
            sb.append('{');
            C21248018De.LJ(sb, "class_name", getClassName());
            C21248018De.LJ(sb, "page_btm", getPageBtm());
            C21248018De.LJ(sb, "btm_pre", this.btmPre);
            C21248018De.LIZ(sb, "btm_pre_from_source_btm_token", Boolean.valueOf(this.btmPreSetFromSourceBtmToken));
            C21248018De.LIZ(sb, "update_token_this_display", Boolean.valueOf(this.updateBySourceBtmTokenInThisDisplay));
            C21248018De.LIZ(sb, "btm_pre_is_token", Boolean.valueOf(this.btmPreIsToken));
            C21248018De.LIZIZ(sb, "step", Integer.valueOf(this.step));
            C21248018De.LJ(sb, "union_pre", getUnionPre());
            C21248018De.LIZIZ(sb, "union_step", Integer.valueOf(getUnionStep()));
            C21248018De.LJ(sb, "page_id", getPageId());
            C21248018De.LIZLLL(sb, "enter_time", Long.valueOf(this.enterTime));
            C21248018De.LIZLLL(sb, "duration", Long.valueOf(this.duration));
            C21248018De.LIZ(sb, "first_show", this.firstShow);
            C21248018De.LJ(sb, Scene.SCENE_SERVICE, this.scene);
            C21248018De.LJ(sb, "page_show_id", getPageShowId());
            C21248018De.LJ(sb, "last_page_show_id", this.lastPageShowId);
            C21248018De.LIZLLL(sb, "last_resume_time", Long.valueOf(this.lastResumeTime));
            C21248018De.LIZLLL(sb, "last_pause_time", Long.valueOf(this.lastPauseTime));
            C21248018De.LIZ(sb, "is_first_page", Boolean.valueOf(this.isFirstPage));
            C21248018De.LIZ(sb, "has_send_enter_page", Boolean.valueOf(this.hasSendEnterPage));
            C21248018De.LJ(sb, "btm_instance_id", getInstanceId());
            C21248018De.LIZ(sb, "is_before_first_resume", Boolean.valueOf(this.isBeforeFirstResume));
            C21248018De.LIZ(sb, "reuse", Boolean.valueOf(this.reuse));
            C21248018De.LIZIZ(sb, "ignore_first_resume_flag", Integer.valueOf(this.ignoreFirstResumeFlag));
            C21248018De.LJ(sb, "unknown_source_btm_token", this.unknownSourceBtmToken);
            sb.append('}');
            return sb.toString();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class_name", getClassName());
            jSONObject.put("page_btm", getPageBtm());
            jSONObject.put("btm_pre", this.btmPre);
            jSONObject.put("btm_pre_from_source_btm_token", this.btmPreSetFromSourceBtmToken);
            jSONObject.put("update_token_this_display", this.updateBySourceBtmTokenInThisDisplay);
            jSONObject.put("btm_pre_is_token", this.btmPreIsToken);
            jSONObject.put("step", this.step);
            jSONObject.put("union_pre", getUnionPre());
            jSONObject.put("union_step", getUnionStep());
            jSONObject.put("page_id", getPageId());
            jSONObject.put("enter_time", this.enterTime);
            jSONObject.put("duration", this.duration);
            jSONObject.put("first_show", this.firstShow);
            jSONObject.put(Scene.SCENE_SERVICE, this.scene);
            jSONObject.put("page_show_id", getPageShowId());
            jSONObject.put("last_page_show_id", this.lastPageShowId);
            jSONObject.put("last_resume_time", this.lastResumeTime);
            jSONObject.put("last_pause_time", this.lastPauseTime);
            jSONObject.put("is_first_page", this.isFirstPage);
            jSONObject.put("has_send_enter_page", this.hasSendEnterPage);
            jSONObject.put("btm_instance_id", getInstanceId());
            jSONObject.put("is_before_first_resume", this.isBeforeFirstResume);
            jSONObject.put("reuse", this.reuse);
            jSONObject.put("1st_resume_flag", this.ignoreFirstResumeFlag);
            jSONObject.put("unknown_source_btm_token", this.unknownSourceBtmToken);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public PageInfo() {
        LazyKt lazyKt = LazyKt.INSTANCE;
        this.instanceId$delegate = lazyKt.lazyNonNull(new C18C5());
        this.pageShowId$delegate = lazyKt.lazyNonNull(new C18DU(this));
        if (!BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            AtomicLong atomicLong = C801030VbZ.LIZ;
            setInstanceId(UUID.randomUUID().toString());
            setPageShowId(C801030VbZ.LIZ(getInstanceId(), null));
        }
        this.lastPageShowId = "";
        this.step = 1;
        this.scene = "normal";
        this.isBeforeFirstResume = true;
    }

    private final void updateBtmShowId() {
        this.lastPageShowId = getPageShowId();
        generateShowId();
    }

    public final void resetDataAfterPageShow() {
        String pageShowId = getPageShowId();
        this.enterTime = 0L;
        this.duration = 0L;
        this.needUpdateShowIdWhenResume = true;
        this.couldUpdateInstanceId = true;
        this.hasSendEnterPage = false;
        C18CK.LJIIIZ("PageInfo_resetDataAfterPageShow", new C20330914gt(this, pageShowId));
    }

    public String save() {
        return toString();
    }

    public final String getBtmPre() {
        return this.btmPre;
    }

    public final boolean getBtmPreIsToken() {
        return this.btmPreIsToken;
    }

    public final boolean getBtmPreSetFromSourceBtmToken() {
        return this.btmPreSetFromSourceBtmToken;
    }

    public final String getClassSimpleName() {
        return this.classSimpleName;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final UnionBufferBtm getEarlierUnionBuffer() {
        return this.earlierUnionBuffer;
    }

    public final boolean getEnterPage() {
        return this.enterPage;
    }

    public final long getEnterTime() {
        return this.enterTime;
    }

    public final Boolean getFirstShow() {
        return this.firstShow;
    }

    public final boolean getHasSendEnterPage() {
        return this.hasSendEnterPage;
    }

    public final int getIgnoreFirstResumeFlag() {
        return this.ignoreFirstResumeFlag;
    }

    public final String getLastPageShowId() {
        return this.lastPageShowId;
    }

    public final long getLastPauseTime() {
        return this.lastPauseTime;
    }

    public final long getLastResumeTime() {
        return this.lastResumeTime;
    }

    public final String getLatestBtmId() {
        return this.latestBtmId;
    }

    public final C21242018Aw getLatestBtmIdNode() {
        return this.latestBtmIdNode;
    }

    public final String getLatestPageBtmId() {
        return this.latestPageBtmId;
    }

    public final C21242018Aw getLatestPageBtmIdNode() {
        return this.latestPageBtmIdNode;
    }

    public final boolean getNeedUpdateShowIdWhenResume() {
        return this.needUpdateShowIdWhenResume;
    }

    public final C21242018Aw getPreBtmIdNode() {
        return this.preBtmIdNode;
    }

    public final EnumC21244218Bs getRecoveryFrom() {
        return this.recoveryFrom;
    }

    public final boolean getReuse() {
        return this.reuse;
    }

    public final String getScene() {
        return this.scene;
    }

    public final int getStep() {
        return this.step;
    }

    public final String getUnknownSourceBtmToken() {
        return this.unknownSourceBtmToken;
    }

    public final boolean getUpdateBySourceBtmTokenInThisDisplay() {
        return this.updateBySourceBtmTokenInThisDisplay;
    }

    public final boolean isBeforeFirstResume() {
        return this.isBeforeFirstResume;
    }

    public final boolean isFirstPage() {
        return this.isFirstPage;
    }

    public final PageInfo copy(PageInfo pageInfo) {
        pageInfo.setPageId(getPageId());
        pageInfo.btmPre = this.btmPre;
        pageInfo.setPageBtm(getPageBtm());
        pageInfo.step = this.step;
        pageInfo.enterTime = this.enterTime;
        pageInfo.duration = this.duration;
        pageInfo.lastResumeTime = this.lastResumeTime;
        pageInfo.lastPauseTime = this.lastPauseTime;
        pageInfo.ignoreFirstResumeFlag = this.ignoreFirstResumeFlag;
        pageInfo.firstShow = this.firstShow;
        pageInfo.setClassName(getClassName());
        pageInfo.scene = this.scene;
        pageInfo.isFirstPage = this.isFirstPage;
        pageInfo.isBeforeFirstResume = this.isBeforeFirstResume;
        pageInfo.setPageShowId(getPageShowId());
        pageInfo.lastPageShowId = this.lastPageShowId;
        pageInfo.setInstanceId(getInstanceId());
        pageInfo.setUnionPre(getUnionPre());
        pageInfo.setUnionStep(getUnionStep());
        pageInfo.earlierUnionBuffer = this.earlierUnionBuffer;
        pageInfo.latestBtmId = this.latestBtmId;
        pageInfo.latestPageBtmId = this.latestPageBtmId;
        pageInfo.btmPreSetFromSourceBtmToken = this.btmPreSetFromSourceBtmToken;
        pageInfo.updateBySourceBtmTokenInThisDisplay = this.updateBySourceBtmTokenInThisDisplay;
        pageInfo.btmPreIsToken = this.btmPreIsToken;
        pageInfo.reuse = this.reuse;
        return pageInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume(X.EnumC21250718Ef r18) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.btm.impl.page.model.PageInfo.onResume(X.18Ef):void");
    }

    public final void onlyResume(EnumC21250718Ef enumC21250718Ef) {
        if (C18E3.LIZ) {
            this.isFirstPage = true;
            C18E3.LIZ = false;
        }
        this.isBeforeFirstResume = false;
        if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            if (C18FN.LIZ()) {
                C18CK.LJIIIZ("PageInfo_onResume", new C20332514h9(enumC21250718Ef, copy()));
            }
        } else {
            C18CK.LJIIIZ("PageInfo_onResume", new C20332614hA(enumC21250718Ef, copy()));
        }
        this.lastResumeTime = SystemClock.elapsedRealtime();
        if (this.enterTime <= 0) {
            this.enterTime = System.currentTimeMillis();
            C18CK.LJIIIZ("PageInfo_onResume", new C20332314h7(this));
            this.duration = 0L;
        }
        monitorFirstPageResumeTime();
        if (this.reuse && C18CS.LIZ.LIZJ().LJIIIIZZ() != 0) {
            if ((C18CS.LIZ.LIZJ().LJIIIIZZ() & 1) != 0) {
                this.firstShow = null;
                this.duration = 0L;
            }
            if ((C18CS.LIZ.LIZJ().LJIIIIZZ() & 2) != 0 && this.couldUpdateInstanceId) {
                this.couldUpdateInstanceId = false;
                generateInstanceId();
            }
        }
        Boolean bool = this.firstShow;
        if (bool == null) {
            C18CK.LJIIIZ("PageInfo_onResume", new C20332214h6(this.reuse));
            this.firstShow = Boolean.TRUE;
        } else if (Intrinsics.LJFF(bool, Boolean.TRUE) && this.duration == 0) {
            C18CK.LJIIIZ("PageInfo_onResume", new C20332414h8());
            this.firstShow = Boolean.FALSE;
        }
        this.reuse = false;
        if (this.ignoreFirstResumeFlag == 1) {
            this.ignoreFirstResumeFlag = 3;
        }
    }

    public PageInfo parse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            setClassName(jSONObject.optString("class_name"));
            String strOptString = jSONObject.optString("page_btm");
            if (strOptString == null || strOptString.length() == 0) {
                strOptString = null;
            }
            setPageBtm(strOptString);
            this.btmPre = jSONObject.optString("btm_pre");
            this.btmPreSetFromSourceBtmToken = jSONObject.optBoolean("btm_pre_from_source_btm_token");
            this.updateBySourceBtmTokenInThisDisplay = jSONObject.optBoolean("update_token_this_display");
            this.btmPreIsToken = jSONObject.optBoolean("btm_pre_is_token");
            this.step = jSONObject.optInt("step");
            setUnionPre(jSONObject.optString("union_pre"));
            setUnionStep(jSONObject.optInt("union_step"));
            setPageId(jSONObject.optString("page_id"));
            this.enterTime = jSONObject.optLong("enter_time");
            this.duration = jSONObject.optLong("duration");
            this.firstShow = Boolean.valueOf(jSONObject.optBoolean("first_show"));
            this.scene = jSONObject.optString(Scene.SCENE_SERVICE);
            setPageShowId(jSONObject.optString("page_show_id"));
            this.lastPageShowId = jSONObject.optString("last_page_show_id");
            this.lastResumeTime = jSONObject.optLong("last_resume_time");
            this.lastPauseTime = jSONObject.optLong("last_pause_time");
            this.isFirstPage = jSONObject.optBoolean("is_first_page");
            this.isBeforeFirstResume = jSONObject.optBoolean("is_before_first_resume", true);
            this.hasSendEnterPage = jSONObject.optBoolean("has_send_enter_page", true);
            setInstanceId(jSONObject.optString("btm_instance_id"));
            this.ignoreFirstResumeFlag = jSONObject.optInt("1st_resume_flag", 0);
            this.unknownSourceBtmToken = jSONObject.optString("unknown_source_btm_token");
            return this;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C18CE.LIZ.LJFF(1498, "PageInfo#parse", null, e, false);
            return this;
        }
    }

    public final void parsePageBtm(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C18CK.LJIIIZ("PageInfo_parsePageBtm", new C20331114gv());
            return;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            if (u.LJJIIJZLJL((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), "a", false) && listLJJLIIIJILLIZJL.size() >= 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                sbLIZ.append('.');
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                sbLIZ.append(".c0.d0");
                setPageBtm(C2188811AlT.LIZIZ(sbLIZ));
            } else if (listLJJLIIIJILLIZJL.size() == 1 && u.LJJIIJZLJL((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), "b", false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C18IP.LIZ.LJ());
                sbLIZ2.append('.');
                sbLIZ2.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                sbLIZ2.append(".c0.d0");
                setPageBtm(C2188811AlT.LIZIZ(sbLIZ2));
            } else if (a0.LJJIIZI(str, "bUnknown", false)) {
                setPageBtm(str);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(", format error");
                C18CE.LIZ.LJFF(1102, C2188811AlT.LIZIZ(sbLIZ3), null, null, false);
                return;
            }
        } else if (listLJJLIIIJILLIZJL.size() == 1 && u.LJJIIJZLJL((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), "b", false)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(C18IP.LIZ.LJ());
            sbLIZ4.append('.');
            sbLIZ4.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
            sbLIZ4.append(".c0.d0");
            setPageBtm(C2188811AlT.LIZIZ(sbLIZ4));
        } else if (a0.LJJIIZI(str, "bUnknown", false)) {
            setPageBtm(str);
        } else if (u.LJJIIJZLJL((String) ListProtector.get(listLJJLIIIJILLIZJL, 0), "a", false) && listLJJLIIIJILLIZJL.size() >= 2) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
            sbLIZ5.append('.');
            sbLIZ5.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
            sbLIZ5.append(".c0.d0");
            setPageBtm(C2188811AlT.LIZIZ(sbLIZ5));
        } else {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(str);
            sbLIZ6.append(", format error");
            C18CE.LIZ.LJFF(1102, C2188811AlT.LIZIZ(sbLIZ6), null, null, false);
            return;
        }
        C18CK.LJIIIZ("PageInfo_parsePageBtm", new C20331014gu(str));
    }

    public final void setBeforeFirstResume(boolean z) {
        this.isBeforeFirstResume = z;
    }

    public final void setBtmPre(String str) {
        this.btmPre = str;
    }

    public final void setBtmPreIsToken(boolean z) {
        this.btmPreIsToken = z;
    }

    public final void setBtmPreSetFromSourceBtmToken(boolean z) {
        this.btmPreSetFromSourceBtmToken = z;
    }

    public final void setClassSimpleName(String str) {
        this.classSimpleName = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEarlierUnionBuffer(UnionBufferBtm unionBufferBtm) {
        this.earlierUnionBuffer = unionBufferBtm;
    }

    public final void setEnterPage(boolean z) {
        this.enterPage = z;
    }

    public final void setEnterTime(long j) {
        this.enterTime = j;
    }

    public final void setFirstPage(boolean z) {
        this.isFirstPage = z;
    }

    public final void setFirstShow(Boolean bool) {
        this.firstShow = bool;
    }

    public final void setHasSendEnterPage(boolean z) {
        this.hasSendEnterPage = z;
    }

    public final void setIgnoreFirstResumeFlag(int i) {
        this.ignoreFirstResumeFlag = i;
    }

    public final void setInstanceId(String str) {
        this.instanceId$delegate.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setLastPageShowId(String str) {
        this.lastPageShowId = str;
    }

    public final void setLastPauseTime(long j) {
        this.lastPauseTime = j;
    }

    public final void setLastResumeTime(long j) {
        this.lastResumeTime = j;
    }

    public final void setLatestBtmId(String str) {
        this.latestBtmId = str;
    }

    public final void setLatestBtmIdNode(C21242018Aw c21242018Aw) {
        this.latestBtmIdNode = c21242018Aw;
    }

    public final void setLatestPageBtmId(String str) {
        this.latestPageBtmId = str;
    }

    public final void setLatestPageBtmIdNode(C21242018Aw c21242018Aw) {
        this.latestPageBtmIdNode = c21242018Aw;
    }

    public final void setNeedUpdateShowIdWhenResume(boolean z) {
        this.needUpdateShowIdWhenResume = z;
    }

    public final void setPageShowId(String str) {
        this.pageShowId$delegate.setValue(this, $$delegatedProperties[1], str);
    }

    public final void setPreBtmIdNode(C21242018Aw c21242018Aw) {
        this.preBtmIdNode = c21242018Aw;
    }

    public final void setRecoveryFrom(EnumC21244218Bs enumC21244218Bs) {
        this.recoveryFrom = enumC21244218Bs;
    }

    public final void setReuse(boolean z) {
        this.reuse = z;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    public final void setUnknownSourceBtmToken(String str) {
        this.unknownSourceBtmToken = str;
    }

    public final void setUpdateBySourceBtmTokenInThisDisplay(boolean z) {
        this.updateBySourceBtmTokenInThisDisplay = z;
    }

    public final void updateShowIdIfNeed(ShowIdUpdateReason showIdUpdateReason) {
        if (this.needUpdateShowIdWhenResume) {
            if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
                if (C18FN.LIZ()) {
                    C18CK.LJIIIZ("PageInfo_updateShowId", new C18DV(copy(), showIdUpdateReason));
                }
            } else {
                C18CK.LJIIIZ("PageInfo_updateShowId", new C18DW(copy(), showIdUpdateReason));
            }
            this.needUpdateShowIdWhenResume = false;
            updateBtmShowId();
        }
    }

    public /* bridge */ /* synthetic */ Object parse(String str) {
        parse(str);
        return this;
    }

    private final boolean isSelf(PageInfo pageInfo, String str) {
        return Intrinsics.LJFF(pageInfo.getPageId(), str);
    }

    public void onPause(Object obj, C21247918Dd c21247918Dd) {
        String string;
        EnumC21248118Df enumC21248118Df;
        EnumC21248118Df enumC21248118Df2;
        String string2;
        BtmServiceImpl btmServiceImpl = BtmServiceImpl.INSTANCE;
        EnumC21248118Df enumC21248118Df3 = null;
        if (btmServiceImpl.getOpenPerfOpt()) {
            if (C18FN.LIZ()) {
                PageInfo pageInfoCopy = copy();
                if (c21247918Dd != null) {
                    string2 = c21247918Dd.toString();
                } else {
                    string2 = null;
                }
                C18CK.LJIIIZ("PageInfo_onPause", new C20332714hB(pageInfoCopy, string2));
            }
        } else {
            PageInfo pageInfoCopy2 = copy();
            if (c21247918Dd != null) {
                string = c21247918Dd.toString();
            } else {
                string = null;
            }
            C18CK.LJIIIZ("PageInfo_onPause", new C20332814hC(pageInfoCopy2, string));
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.lastPauseTime = jElapsedRealtime;
        long j = this.lastResumeTime;
        if (j > 0) {
            this.duration += jElapsedRealtime - j;
        } else {
            C18CE.LIZ.LJFF(1104, "lastResumeTime is " + this.lastResumeTime, null, null, false);
        }
        btmServiceImpl.getChainRecorderExp().LJI.put(getPageShowId(), Long.valueOf(this.duration));
        if (c21247918Dd != null) {
            enumC21248118Df = c21247918Dd.LIZJ;
        } else {
            enumC21248118Df = null;
        }
        if (enumC21248118Df != EnumC21248118Df.BACKGROUND) {
            if (c21247918Dd != null) {
                enumC21248118Df2 = c21247918Dd.LIZJ;
            } else {
                enumC21248118Df2 = null;
            }
            if (enumC21248118Df2 == EnumC21248118Df.FORWARD) {
                C18DA c18da = C18DA.LIZ;
                C18DA.LJIIIZ(this, c21247918Dd, false);
            } else {
                if (c21247918Dd != null) {
                    enumC21248118Df3 = c21247918Dd.LIZJ;
                }
                if (enumC21248118Df3 == EnumC21248118Df.BACK) {
                    C18DA c18da2 = C18DA.LIZ;
                    C18DA.LJIIIZ(this, c21247918Dd, true);
                }
            }
        }
        this.updateBySourceBtmTokenInThisDisplay = false;
    }

    public final void setProp(PageProp pageProp, Object obj, PageInfoStack pageInfoStack) {
        pageProp.setAuto(true);
        C18CK.LJIIIZ("PageInfo_setProp", new C18DT(pageProp, obj.getClass().getName()));
        parsePageBtm(pageProp.getBtm());
        setClassName(obj.getClass().getName());
        this.classSimpleName = obj.getClass().getSimpleName();
        pageInfoStack.setPageProp(pageProp);
        if (pageProp.getIgnoreSystemFirstResume()) {
            this.ignoreFirstResumeFlag = 1;
        }
    }

    public final void putSourceBtm(String str, int i, String str2, boolean z, boolean z2) {
        C18CK.LJIIIZ("PageInfo_putSourceBtm", new C18DS(this, str, i, str2));
        if (isSelf(this, str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pre=");
            sbLIZ.append(str);
            sbLIZ.append(", step=");
            sbLIZ.append(i);
            C18CE.LIZ.LJFF(1123, C2188811AlT.LIZIZ(sbLIZ), null, null, false);
            return;
        }
        if (z) {
            reset();
        }
        this.btmPre = str;
        this.step = i;
        this.btmPreIsToken = z2;
    }
}
