package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.SoundWaveEffectListResp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_social_data.SoundWareEffect;
import webcast.data.multi_guest_social_data._SoundWareEffect_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _SoundWaveEffectListResp_ResponseData_ProtoDecoder implements C0IMD<SoundWaveEffectListResp.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(SoundWaveEffectListResp.ResponseData responseData) {
        SoundWaveEffectListResp.ResponseData responseData2 = responseData;
        List<SoundWareEffect> list = responseData2.soundWaveEffects;
        if (list == null) {
            responseData2.soundWaveEffects = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<SoundWareEffect> it2 = responseData2.soundWaveEffects.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final SoundWaveEffectListResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SoundWaveEffectListResp.ResponseData responseData = new SoundWaveEffectListResp.ResponseData();
        responseData.soundWaveEffects = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.guide = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.soundWaveEffects.add(_SoundWareEffect_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SoundWaveEffectListResp.ResponseData responseData, List list) {
    }
}
