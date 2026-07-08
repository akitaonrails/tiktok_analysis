package X;

import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453950nwH {
    public static final C385670FAf LIZ(EnumC1642750sqn enumC1642750sqn, C385670FAf c385670FAf, h0 h0Var) {
        if (enumC1642750sqn != EnumC1642750sqn.LAZY && enumC1642750sqn != EnumC1642750sqn.FORCE_LAZY) {
            return c385670FAf;
        }
        return h0Var;
    }

    public static EnumC1642750sqn LIZJ(VideoPublishEditModel videoPublishEditModel, EnumC1642750sqn enumC1642750sqn, int i) {
        if ((i & 2) != 0) {
            enumC1642750sqn = null;
        }
        int i2 = i & 4;
        if (C365940EWi.LIZLLL(videoPublishEditModel)) {
            return EnumC1642750sqn.LAZY;
        }
        if (enumC1642750sqn != null) {
            return enumC1642750sqn;
        }
        return EnumC1642750sqn.IMMEDIATE;
    }

    public static final C385670FAf LIZIZ(h0 h0Var, VideoPublishEditModel videoPublishEditModel, EnumC1642750sqn enumC1642750sqn, h0 h0Var2) {
        if ((enumC1642750sqn != EnumC1642750sqn.LAZY && enumC1642750sqn != EnumC1642750sqn.FORCE_LAZY) || C365940EWi.LIZLLL(videoPublishEditModel)) {
            return h0Var;
        }
        return h0Var2;
    }
}
