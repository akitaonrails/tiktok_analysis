package X;

import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;

/* JADX INFO: renamed from: X.0RQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695690RQp {
    public static final EnumC695670RQn LIZ(ComponentStrategy componentStrategy) {
        int i = componentStrategy.lazyMode;
        EnumC695670RQn enumC695670RQn = EnumC695670RQn.NEVER_LAZY;
        if (i != enumC695670RQn.getMode()) {
            EnumC695670RQn enumC695670RQn2 = EnumC695670RQn.NEVER_EXECUTE;
            if (i != enumC695670RQn2.getMode()) {
                enumC695670RQn2 = EnumC695670RQn.FIRST_UI_FRAME;
                if (i != enumC695670RQn2.getMode()) {
                    enumC695670RQn2 = EnumC695670RQn.FIRST_VIDEO_SHOW;
                    if (i != enumC695670RQn2.getMode()) {
                        enumC695670RQn2 = EnumC695670RQn.FIRST_VIDEO_FORBID;
                        if (i != enumC695670RQn2.getMode()) {
                            enumC695670RQn2 = EnumC695670RQn.SPLIT_TO_FRAME;
                            if (i != enumC695670RQn2.getMode()) {
                                enumC695670RQn2 = EnumC695670RQn.FIRST_VIDEO_HAS_LEFT;
                                if (i != enumC695670RQn2.getMode()) {
                                    enumC695670RQn2 = EnumC695670RQn.SECOND_VIDEO_HAS_LEFT;
                                    if (i != enumC695670RQn2.getMode()) {
                                        enumC695670RQn2 = EnumC695670RQn.START_UP_END;
                                        if (i == enumC695670RQn2.getMode()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return enumC695670RQn2;
        }
        return enumC695670RQn;
    }
}
