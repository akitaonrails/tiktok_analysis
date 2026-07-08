package X;

import android.content.Context;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteParam;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0r65, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575350r65 {
    public static final List<C1575910r6z> LIZ(Context context, EnumC1575330r63 enumC1575330r63, VibeFeedInviteParam vibeFeedInviteParam) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        boolean zIsGroup = vibeFeedInviteParam.getMutualFeedScene().isGroup();
        int i = C1575340r64.LIZ[enumC1575330r63.ordinal()];
        if (i != 1) {
            if (i != 2) {
                C1575910r6z[] c1575910r6zArr = new C1575910r6z[3];
                if (zIsGroup) {
                    string13 = context.getString(2131835302);
                    string14 = context.getString(2131835283);
                } else {
                    string13 = context.getString(2131847975);
                    string14 = context.getString(2131847974);
                }
                c1575910r6zArr[0] = new C1575910r6z(R.raw.icon_video_stack_fill, string13, string14);
                if (zIsGroup) {
                    string15 = context.getString(2131835303);
                    string16 = context.getString(2131835298);
                } else {
                    string15 = context.getString(2131847976);
                    string16 = context.getString(2131847972);
                }
                c1575910r6zArr[1] = new C1575910r6z(R.raw.icon_person_plus_fill, string15, string16);
                if (zIsGroup) {
                    string17 = context.getString(2131835304);
                    string18 = context.getString(2131835299);
                } else {
                    string17 = context.getString(2131847994);
                    string18 = context.getString(2131847973);
                }
                c1575910r6zArr[2] = new C1575910r6z(R.raw.icon_like_fill, string17, string18);
                return C1697810uHb.LJIIJJI(c1575910r6zArr);
            }
            C1575910r6z[] c1575910r6zArr2 = new C1575910r6z[3];
            if (zIsGroup) {
                string7 = context.getString(2131835273);
                string8 = context.getString(2131835283);
            } else {
                string7 = context.getString(2131847975);
                string8 = context.getString(2131847974);
            }
            c1575910r6zArr2[0] = new C1575910r6z(R.raw.icon_video_stack_fill, string7, string8);
            if (zIsGroup) {
                string9 = context.getString(2131835274);
                string10 = context.getString(2131835269);
            } else {
                string9 = context.getString(2131847976);
                string10 = context.getString(2131847972);
            }
            c1575910r6zArr2[1] = new C1575910r6z(R.raw.icon_person_plus_fill, string9, string10);
            if (zIsGroup) {
                string11 = context.getString(2131835275);
                string12 = context.getString(2131835270);
            } else {
                string11 = context.getString(2131847994);
                string12 = context.getString(2131847973);
            }
            c1575910r6zArr2[2] = new C1575910r6z(R.raw.icon_like_fill, string11, string12);
            return C1697810uHb.LJIIJJI(c1575910r6zArr2);
        }
        C1575910r6z[] c1575910r6zArr3 = new C1575910r6z[3];
        if (zIsGroup) {
            string = context.getString(2131835302);
            string2 = context.getString(2131835283);
        } else {
            string = context.getString(2131847975);
            string2 = context.getString(2131847974);
        }
        c1575910r6zArr3[0] = new C1575910r6z(R.raw.icon_templates_cards_fill, string, string2);
        if (zIsGroup) {
            string3 = context.getString(2131835303);
            string4 = context.getString(2131835298);
        } else {
            string3 = context.getString(2131847976);
            string4 = context.getString(2131847972);
        }
        c1575910r6zArr3[1] = new C1575910r6z(R.raw.icon_person_plus_fill, string3, string4);
        if (zIsGroup) {
            string5 = context.getString(2131835304);
            string6 = context.getString(2131835299);
        } else {
            string5 = context.getString(2131847994);
            string6 = context.getString(2131847973);
        }
        c1575910r6zArr3[2] = new C1575910r6z(R.raw.icon_like_fill, string5, string6);
        return C1697810uHb.LJIIJJI(c1575910r6zArr3);
    }

    public static final String LIZIZ(Context context, EnumC1575330r63 enumC1575330r63, VibeFeedInviteParam vibeFeedInviteParam) {
        if (vibeFeedInviteParam.getMutualFeedScene().isGroup()) {
            if (enumC1575330r63 == EnumC1575330r63.INTRODUCTION) {
                return context.getString(2131835305);
            }
            if (enumC1575330r63 == EnumC1575330r63.ACCEPT) {
                return context.getString(2131835271);
            }
            if (enumC1575330r63 == EnumC1575330r63.INVITE_GAP) {
                return context.getString(2131835290);
            }
            if (enumC1575330r63 == EnumC1575330r63.RE_INVITE) {
                return context.getString(2131847980);
            }
            return context.getString(2131835300);
        }
        if (enumC1575330r63 == EnumC1575330r63.INTRODUCTION) {
            return context.getString(2131847990);
        }
        if (enumC1575330r63 == EnumC1575330r63.ACCEPT) {
            return context.getString(2131847965);
        }
        if (enumC1575330r63 == EnumC1575330r63.INVITE_GAP) {
            return context.getString(2131847977);
        }
        if (enumC1575330r63 == EnumC1575330r63.RE_INVITE) {
            return context.getString(2131847980);
        }
        return context.getString(2131847983);
    }

    public static final String LIZJ(Context context, EnumC1575330r63 enumC1575330r63, VibeFeedInviteParam vibeFeedInviteParam) {
        if (vibeFeedInviteParam.getMutualFeedScene().isGroup()) {
            if (enumC1575330r63 == EnumC1575330r63.ACCEPT) {
                return context.getString(2131835272);
            }
            if (enumC1575330r63 == EnumC1575330r63.INTRODUCTION) {
                return context.getString(2131835306);
            }
            return context.getString(2131835301);
        }
        String strLJ = C1575440r6E.LJ(vibeFeedInviteParam.getToUserId());
        if (enumC1575330r63 == EnumC1575330r63.ACCEPT) {
            return context.getString(2131847966, strLJ);
        }
        if (enumC1575330r63 == EnumC1575330r63.INTRODUCTION) {
            return context.getString(2131847991);
        }
        return context.getString(2131847984, strLJ);
    }
}
