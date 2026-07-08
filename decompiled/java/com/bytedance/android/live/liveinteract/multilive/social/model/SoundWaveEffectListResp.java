package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_social_data.SoundWareEffect;

/* JADX INFO: loaded from: classes.dex */
public final class SoundWaveEffectListResp {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("sound_wave_effects")
        public List<SoundWareEffect> soundWaveEffects = new ArrayList();

        @C09CT("guide")
        public String guide = "";
    }
}
