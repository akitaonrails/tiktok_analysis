package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0bQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC972770bQB implements WireEnum {
    VAR_LINK_MIC_LIVE_ROOM_MODE_NORMAL(0),
    VAR_LINK_MIC_LIVE_ROOM_MODE_OBS(1),
    VAR_LINK_MIC_LIVE_ROOM_MODE_MEDIA(2),
    VAR_LINK_MIC_LIVE_ROOM_MODE_AUDIO(3),
    VAR_LINK_MIC_LIVE_ROOM_MODE_SCREEN(4),
    VAR_LINK_MIC_LIVE_ROOM_MODE_LIVE_STUDIO(5),
    VAR_LINK_MIC_LIVE_ROOM_MODE_LIVE_VOICE(6);

    public static final ProtoAdapter<EnumC972770bQB> ADAPTER = new EnumAdapter<EnumC972770bQB>() { // from class: X.0bQC
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC972770bQB.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC972770bQB fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_LIVE_ROOM_MODE_NORMAL;
            case 1:
                return VAR_LINK_MIC_LIVE_ROOM_MODE_OBS;
            case 2:
                return VAR_LINK_MIC_LIVE_ROOM_MODE_MEDIA;
            case 3:
                return VAR_LINK_MIC_LIVE_ROOM_MODE_AUDIO;
            case 4:
                return VAR_LINK_MIC_LIVE_ROOM_MODE_SCREEN;
            case 5:
                return VAR_LINK_MIC_LIVE_ROOM_MODE_LIVE_STUDIO;
            case 6:
                return VAR_LINK_MIC_LIVE_ROOM_MODE_LIVE_VOICE;
            default:
                return null;
        }
    }

    public static EnumC972770bQB valueOf(String str) {
        return (EnumC972770bQB) C08FF.LIZ(EnumC972770bQB.class, str);
    }

    EnumC972770bQB(int i) {
        this.LL = i;
    }
}
