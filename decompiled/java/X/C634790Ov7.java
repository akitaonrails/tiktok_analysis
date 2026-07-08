package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.p;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.UUID;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0Ov7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634790Ov7 extends AbstractC604200Nms {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZIZ;
        long jLongValue;
        InterfaceC604220Nmu interfaceC604220Nmu = (InterfaceC604220Nmu) xBaseParamModel;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Integer numValueOf = null;
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
            k kVar = GsonProtectorUtils.parse(new p(), interfaceC604220Nmu.getMusic());
            if (kVar != null) {
                Music music = (Music) GsonProtectorUtils.fromJson(new Gson(), kVar, Music.class);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(music.getIdStr());
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                music.setId(jLongValue);
                String string = UUID.randomUUID().toString();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("content_type", "share");
                c0lab.LJ("shared_content_type", "music");
                c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
                if (C298260Bma.LIZ()) {
                    ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZIZ(new C1449410nox(string, interfaceC604220Nmu.getShootWay(), "single_song", null, null, new C1449430noz(String.valueOf(music.getId()), interfaceC604220Nmu.getMusicSelectedFrom()), null, null, 216), c0lab, null);
                } else {
                    c0lab.LJ("enter_from", "single_song");
                    c0lab.LJ("shoot_way", interfaceC604220Nmu.getShootWay());
                    c0lab.LJ("creation_id", string);
                    c0lab.LJ("music_selected_from", interfaceC604220Nmu.getMusicSelectedFrom());
                    C20684815ws.LJIILLIIL("shoot", c0lab.LIZ);
                }
                String enterFrom = interfaceC604220Nmu.getEnterFrom();
                String shootWay = interfaceC604220Nmu.getShootWay();
                String musicSelectedFrom = interfaceC604220Nmu.getMusicSelectedFrom();
                Number landingBack = interfaceC604220Nmu.getLandingBack();
                if (landingBack != null) {
                    numValueOf = Integer.valueOf(landingBack.intValue());
                }
                new C1400640mYI(activityLIZIZ, music, enterFrom, string, shootWay, musicSelectedFrom, numValueOf, 22, new AwS375S0200000_9(completionBlock, (CompletionBlock<InterfaceC604190Nmr>) this, (C634790Ov7) 173)).LIZ();
                return;
            }
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Android currentContext is null", null, 4);
    }
}
