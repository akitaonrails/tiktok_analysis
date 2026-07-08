package X;

import Y.ARunnableS129S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.ogc.news.anchor.INewsAnchorProducer;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo.NewsAnchorContent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19512911Vv implements INewsAnchorProducer {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(427));

    public static final CreateAnchorInfo LIZJ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel == null || (str = videoPublishEditModel.commerceData) == null) {
            str = "";
        }
        List<CreateAnchorInfo> list = PublishExtensionModel.fromString(str).createAnchorInfos;
        CreateAnchorInfo createAnchorInfo = null;
        if (list == null) {
            return null;
        }
        Iterator<CreateAnchorInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CreateAnchorInfo next = it2.next();
            if (next.getType() == EnumC1430380nKG.NEWS.getTYPE()) {
                createAnchorInfo = next;
                break;
            }
        }
        return createAnchorInfo;
    }

    @Override // com.ss.android.ugc.aweme.ogc.news.anchor.INewsAnchorProducer
    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList arrayList;
        if (videoPublishEditModel == null) {
            return;
        }
        PublishExtensionModel publishExtensionModelFromString = PublishExtensionModel.fromString(videoPublishEditModel.commerceData);
        List<CreateAnchorInfo> list = publishExtensionModelFromString.createAnchorInfos;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list);
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((CreateAnchorInfo) obj).getType() != EnumC1430380nKG.NEWS.getTYPE()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        publishExtensionModelFromString.createAnchorInfos = arrayList;
        videoPublishEditModel.commerceData = PublishExtensionModel.toString(publishExtensionModelFromString);
        C1440005kM.LIZ(new C0YUS(EnumC1430380nKG.NEWS.getTYPE()));
    }

    public final boolean LIZLLL(Context context) {
        Activity activityLIZ;
        Object c098200Yq;
        this.LIZIZ.getValue().getClass();
        NewsAnchorContent newsAnchorContent = C19513011Vw.LIZLLL;
        if (newsAnchorContent == null) {
            Object obj = null;
            try {
                C1227904rF c1227904rF = (C1227904rF) C19513011Vw.LIZJ.getValue();
                String string = ((Keva) C19513011Vw.LIZIZ.getValue()).getString(C19513011Vw.LIZ(), null);
                c1227904rF.getClass();
                c098200Yq = (NewsAnchorContent) C1227904rF.LIZIZ(string, NewsAnchorContent.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            newsAnchorContent = (NewsAnchorContent) obj;
            C19513011Vw.LIZLLL = newsAnchorContent;
        }
        if (newsAnchorContent != null && Intrinsics.LJFF(newsAnchorContent.isPublisherSuspended, Boolean.TRUE)) {
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(activityLIZ.getString(2131832465));
                c1389890mGx.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
                c1389890mGx.LJIIJJI();
            }
            return false;
        }
        return true;
    }

    public final void LJI(INewsAnchorProducer.PublishAnchorConfig publishAnchorConfig) {
        this.LIZIZ.getValue().getClass();
        C11S5.LIZ().LIZIZ(new ARunnableS129S0100000_29(publishAnchorConfig, 213));
    }

    public static final void LIZIZ(C2344009Gk c2344009Gk, AnchorTransData anchorTransData) {
        try {
            c2344009Gk.LJFF("news_content_title", anchorTransData.title);
            String strDecode = Uri.decode(anchorTransData.url);
            strDecode.toString();
            c2344009Gk.LJFF("news_content_url", strDecode);
            C189200o6.m2constructorimpl(c2344009Gk);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ(com.ss.android.ugc.aweme.creative.model.AnchorTransData r6, java.util.ArrayList<com.ss.android.ugc.aweme.creative.model.AnchorTransData> r7) {
        /*
            r5 = 0
            r4 = 1
            if (r6 == 0) goto L38
            int r1 = r6.businessType     // Catch: java.lang.Throwable -> L45
            X.0nKG r0 = X.EnumC1430380nKG.NEWS     // Catch: java.lang.Throwable -> L45
            int r0 = r0.getTYPE()     // Catch: java.lang.Throwable -> L45
            if (r1 != r0) goto L38
            java.util.Iterator r3 = r7.iterator()     // Catch: java.lang.Throwable -> L45
            r2 = 0
        L13:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L45
            com.ss.android.ugc.aweme.creative.model.AnchorTransData r0 = (com.ss.android.ugc.aweme.creative.model.AnchorTransData) r0     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L2c
            int r1 = r0.businessType     // Catch: java.lang.Throwable -> L45
            X.0nKG r0 = X.EnumC1430380nKG.NEWS     // Catch: java.lang.Throwable -> L45
            int r0 = r0.getTYPE()     // Catch: java.lang.Throwable -> L45
            if (r1 != r0) goto L2c
            goto L2f
        L2c:
            int r2 = r2 + 1
            goto L13
        L2f:
            if (r2 < 0) goto L3a
            r7.remove(r2)     // Catch: java.lang.Throwable -> L45
            r7.add(r2, r6)     // Catch: java.lang.Throwable -> L45
            goto L3d
        L38:
            r4 = 0
            goto L3d
        L3a:
            r7.add(r6)     // Catch: java.lang.Throwable -> L45
        L3d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L45
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L45
            goto L51
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L51:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L58
            r1 = 0
        L58:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L60
            boolean r5 = r1.booleanValue()
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19512911Vv.LJ(com.ss.android.ugc.aweme.creative.model.AnchorTransData, java.util.ArrayList):boolean");
    }

    public final void LJFF(Context context, Function0<C19513311Vz> function0) {
        try {
            if (LIZLLL(context)) {
                C19513311Vz c19513311VzInvoke = function0.invoke();
                Boolean bool = c19513311VzInvoke.LIZIZ;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2)) {
                    C436801mw.LIZ(2131826649, 500L, null, null, 12);
                    return;
                }
                AwS273S0300000_29 awS273S0300000_29 = new AwS273S0300000_29(context, this, c19513311VzInvoke, 25);
                int i = C19513111Vx.LIZ[c19513311VzInvoke.LIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new C1954807lC();
                    }
                    awS273S0300000_29.invoke();
                } else if (Intrinsics.LJFF(c19513311VzInvoke.LJ, bool2)) {
                    C436801mw.LIZ(2131826551, 500L, null, null, 12);
                } else {
                    awS273S0300000_29.invoke();
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
