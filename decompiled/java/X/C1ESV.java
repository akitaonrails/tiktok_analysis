package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1ESV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ESV extends Message<C1ESV, C1EST> {
    public static final ProtoAdapter<C1ESV> ADAPTER = new ProtoAdapter<C1ESV>() { // from class: X.1ESU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1ESV decode(ProtoReader protoReader) {
            C1EST c1est = new C1EST();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1est.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1est.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1est.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1est.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1est.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c1est.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1est.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c1est.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1est.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1est.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1est.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1est.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1est.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c1est.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c1est.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            c1est.LJIIZILJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c1est.LJIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c1est.LJIJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            c1est.LJIJJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c1est.LJIJJLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c1est.LJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c1est.LJJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            c1est.LJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 25:
                            c1est.LJJIFFI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            c1est.LJJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 27:
                            c1est.LJJIII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 28:
                            c1est.LJJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 29:
                            c1est.LJJIIJZLJL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 30:
                            c1est.LJJIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 31:
                            c1est.LJJIIZI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 32:
                            c1est.LJJIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c1est.LJJIJIIJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c1est.LJJIJIIJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 35:
                            c1est.LJJIJIL = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c1est.LJJIJL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 37:
                            c1est.LJJIJLIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 38:
                            c1est.LJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 39:
                            c1est.LJJIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 40:
                            c1est.LJJJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 41:
                            c1est.LJJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 42:
                            c1est.LJJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 43:
                            c1est.LJJJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 44:
                            c1est.LJJJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 45:
                            c1est.LJJJJIZL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 46:
                            c1est.LJJJJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 47:
                            c1est.LJJJJJL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 48:
                            c1est.LJJJJL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 49:
                            c1est.LJJJJLI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            c1est.LJJJJLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 51:
                            c1est.LJJJJZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 52:
                            c1est.LJJJJZI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 53:
                            c1est.LJJJLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 54:
                            c1est.LJJJLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 55:
                            c1est.LJJJLZIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 56:
                            c1est.LJJJZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 57:
                            c1est.LJJL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 58:
                            c1est.LJJLI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 59:
                            c1est.LJJLIIIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 60:
                            c1est.LJJLIIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 61:
                            c1est.LJJLIIIJILLIZJL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BaseNotice.CREATOR /* 62 */:
                            c1est.LJJLIIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 63:
                            c1est.LJJLIIIJJIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 64:
                            c1est.LJJLIIIJL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 65:
                            c1est.LJJLIIIJLJLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 66:
                            c1est.LJJLIIIJLLLLLLLZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 67:
                            c1est.LJJLIIJ.add(C1601740rme.ADAPTER.decode(protoReader));
                            break;
                        case 68:
                            c1est.LJJLIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 69:
                            c1est.LJJLJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 70:
                            c1est.LJJLJLI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 71:
                            c1est.LJJLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                            c1est.LJJZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 73:
                            c1est.LJJZZI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 74:
                            c1est.LJJZZIII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 75:
                            c1est.LJL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 76:
                            c1est.LJLI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 77:
                            c1est.LJLIIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 78:
                            c1est.LJLIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 79:
                            c1est.LJLIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 80:
                            c1est.LJLILLLLZI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 81:
                            c1est.LJLJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 82:
                            c1est.LJLJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 83:
                            c1est.LJLJJL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 84:
                            c1est.LJLJJLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 85:
                            c1est.LJLJL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 86:
                            c1est.LJLJLJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 87:
                            c1est.LJLJLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 88:
                            c1est.LJLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 89:
                            c1est.LJLLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 90:
                            c1est.LJLLILLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 91:
                            c1est.LJLLJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 92:
                            c1est.LJLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 93:
                            c1est.LJLLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 94:
                            c1est.LJLLLLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 95:
                            c1est.LJLZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 96:
                            c1est.LJZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 97:
                            c1est.LJZI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 98:
                            c1est.LJZL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 99:
                            c1est.LL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 100:
                            c1est.LLD = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 101:
                            c1est.LLF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 102:
                            c1est.LLFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 103:
                            c1est.LLFFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 104:
                            c1est.LLFII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 105:
                            c1est.LLFZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 106:
                            c1est.LLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 107:
                            c1est.LLIFFJFJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 108:
                            c1est.LLII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 109:
                            c1est.LLIIII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 110:
                            c1est.LLIIIILZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 111:
                            c1est.LLIIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 112:
                            c1est.LLIIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 113:
                            c1est.LLIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 114:
                            c1est.LLIIJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 115:
                            c1est.LLIIJLIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 116:
                            c1est.LLIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 117:
                            c1est.LLIILII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 118:
                            c1est.LLIILZL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 119:
                            c1est.LLIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 120:
                            c1est.LLIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 121:
                            c1est.LLILII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 122:
                            c1est.LLILIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 123:
                            c1est.LLILL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 124:
                            c1est.LLILLIZIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 125:
                            c1est.LLILLJJLI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 126:
                            c1est.LLILLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 127:
                            c1est.LLILZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 128:
                            c1est.LLILZIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 129:
                            c1est.LLILZLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 130:
                            c1est.LLIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 131:
                            c1est.LLIZLLLIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 132:
                            c1est.LLJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 133:
                            c1est.LLJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 134:
                            c1est.LLJIJIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 135:
                            c1est.LLJILJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 136:
                            c1est.LLJILJILJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 137:
                            c1est.LLJILLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 138:
                            c1est.LLJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 139:
                            c1est.LLJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 140:
                            c1est.LLJJIII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 141:
                            c1est.LLJJIJI = C2224041C2w.ADAPTER.decode(protoReader);
                            break;
                        case 142:
                            c1est.LLJJIJIIJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 143:
                            c1est.LLJJIJIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 144:
                            c1est.LLJJJ = C1DC8.ADAPTER.decode(protoReader);
                            break;
                        case 145:
                            c1est.LLJJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 146:
                            c1est.LLJJJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 147:
                            c1est.LLJJJJJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 148:
                            c1est.LLJJJJLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 149:
                            c1est.LLJJL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 150:
                            c1est.LLJJLIIIJLLLLLLLZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 151:
                            c1est.LLJL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 152:
                            c1est.LLJLIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 153:
                            c1est.LLJLILLLLZIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 154:
                            c1est.LLJLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 155:
                            c1est.LLJLLIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 156:
                            c1est.LLJLLL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 157:
                            c1est.LLJZ = C036N.ADAPTER.decode(protoReader);
                            break;
                        case 158:
                            c1est.LLJZIJLIL = C1C0V.ADAPTER.decode(protoReader);
                            break;
                        case 159:
                            c1est.LLL = C1CAL.ADAPTER.decode(protoReader);
                            break;
                        case 160:
                            c1est.LLLF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 161:
                            c1est.LLLFF = C2251721DBi.ADAPTER.decode(protoReader);
                            break;
                        case 162:
                            c1est.LLLFFI = C1CNQ.ADAPTER.decode(protoReader);
                            break;
                        case 163:
                            c1est.LLLFZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 164:
                            c1est.LLLI.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 165:
                            c1est.LLLII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 166:
                            c1est.LLLIIII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 167:
                            c1est.LLLIIIIL = C1D9M.ADAPTER.decode(protoReader);
                            break;
                        case 168:
                            c1est.LLLIIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 169:
                            c1est.LLLIIL = C1D9K.ADAPTER.decode(protoReader);
                            break;
                        case 170:
                            c1est.LLLIILIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 171:
                            c1est.LLLIL = C1CHH.ADAPTER.decode(protoReader);
                            break;
                        case 172:
                            c1est.LLLILZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 173:
                            c1est.LLLILZJ = C760702y5.ADAPTER.decode(protoReader);
                            break;
                        case 174:
                            c1est.LLLILZLLLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 175:
                            c1est.LLLIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 176:
                            c1est.LLLJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 177:
                            c1est.LLLJIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 178:
                            c1est.LLLJL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 179:
                            c1est.LLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 180:
                            c1est.LLLLII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 181:
                            c1est.LLLLIIIILLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 182:
                            c1est.LLLLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 183:
                            c1est.LLLLIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 184:
                            c1est.LLLLIILLL = C2229771COx.ADAPTER.decode(protoReader);
                            break;
                        case 185:
                            c1est.LLLLIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 186:
                            c1est.LLLLILI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 187:
                            c1est.LLLLJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 188:
                            c1est.LLLLJI = C1C0S.ADAPTER.decode(protoReader);
                            break;
                        case 189:
                            c1est.LLLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 190:
                            c1est.LLLLLIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 191:
                            c1est.LLLLLILLIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 192:
                            c1est.LLLLLJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 193:
                            c1est.LLLLLJLJLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 194:
                            c1est.LLLLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 195:
                            c1est.LLLLLLIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 196:
                            c1est.LLLLLLJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 197:
                            c1est.LLLLLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 198:
                            c1est.LLLLLLLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 199:
                            c1est.LLLLLLLLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 200:
                            c1est.LLLLLLLZIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 201:
                            c1est.LLLLLLZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 202:
                            c1est.LLLLLLZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 203:
                            c1est.LLLLLZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 204:
                            c1est.LLLLLZIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1est.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1ESV c1esv) {
            C1ESV c1esv2 = c1esv;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1esv2.type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1esv2.max_cursor) + protoAdapter2.encodedSizeWithTag(3, c1esv2.min_cursor) + protoAdapter.encodedSizeWithTag(4, c1esv2.count) + protoAdapter.encodedSizeWithTag(5, c1esv2.feed_style) + protoAdapter2.encodedSizeWithTag(6, c1esv2.aweme_id) + protoAdapter.encodedSizeWithTag(7, c1esv2.pull_type);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, c1esv2.volume) + protoAdapter.encodedSizeWithTag(9, c1esv2.need_relieve_aweme) + protoAdapter.encodedSizeWithTag(10, c1esv2.address_book_access) + protoAdapter3.encodedSizeWithTag(12, c1esv2.top_view_cid) + protoAdapter3.encodedSizeWithTag(13, c1esv2.content_language) + protoAdapter3.encodedSizeWithTag(14, c1esv2.discard_cids) + protoAdapter2.encodedSizeWithTag(15, c1esv2.interest_select_duration) + protoAdapter3.encodedSizeWithTag(16, c1esv2.preload_aweme_ids) + protoAdapter3.encodedSizeWithTag(17, c1esv2.download_sdk_info) + protoAdapter.encodedSizeWithTag(18, c1esv2.cached_item_num) + protoAdapter.encodedSizeWithTag(19, c1esv2.last_ad_show_interval) + protoAdapter3.encodedSizeWithTag(20, c1esv2.interest_list) + protoAdapter3.encodedSizeWithTag(21, c1esv2.preload_live_item_id) + protoAdapter.encodedSizeWithTag(22, c1esv2.action_mask) + protoAdapter3.encodedSizeWithTag(23, c1esv2.af_params) + protoAdapter3.encodedSizeWithTag(25, c1esv2.show_ids) + protoAdapter3.encodedSizeWithTag(26, c1esv2.cache_ids) + protoAdapter3.encodedSizeWithTag(27, c1esv2.local_cache);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(28, c1esv2.disable_personalization) + protoAdapter3.encodedSizeWithTag(29, c1esv2.showtime_gap_req_info) + protoAdapter.encodedSizeWithTag(30, c1esv2.client_cache_request_count) + protoAdapter.encodedSizeWithTag(31, c1esv2.filter_warn) + protoAdapter.encodedSizeWithTag(32, c1esv2.is_audio_mode) + protoAdapter.encodedSizeWithTag(33, c1esv2.vpa_content_choice) + protoAdapter.encodedSizeWithTag(34, c1esv2.sp) + ProtoAdapter.FLOAT.encodedSizeWithTag(35, c1esv2.tail_slot_probability) + protoAdapter.encodedSizeWithTag(36, c1esv2.personalization_setting) + protoAdapter3.encodedSizeWithTag(37, c1esv2.client_ai_download_json_str) + protoAdapter3.encodedSizeWithTag(38, c1esv2.recent_items_from_client) + protoAdapter3.encodedSizeWithTag(39, c1esv2.topview_preload_ad_ids) + protoAdapter2.encodedSizeWithTag(40, c1esv2.batch_number) + protoAdapter3.encodedSizeWithTag(41, c1esv2.aweme_ids) + protoAdapter3.encodedSizeWithTag(42, c1esv2.preferred_language) + protoAdapter3.encodedSizeWithTag(43, c1esv2.bot_mocked_gids) + protoAdapter.encodedSizeWithTag(44, c1esv2.disable_quality_protection) + protoAdapter3.encodedSizeWithTag(45, c1esv2.skan_versions) + protoAdapter3.encodedSizeWithTag(46, c1esv2.debug_regions) + protoAdapter3.encodedSizeWithTag(47, c1esv2.os_boot_time) + protoAdapter.encodedSizeWithTag(48, c1esv2.is_landscape) + protoAdapter.encodedSizeWithTag(49, c1esv2.is_pad) + protoAdapter3.encodedSizeWithTag(50, c1esv2.req_from) + protoAdapter.encodedSizeWithTag(51, c1esv2.ad_personality_mode) + protoAdapter3.encodedSizeWithTag(52, c1esv2.gaid) + protoAdapter3.encodedSizeWithTag(53, c1esv2.sound_output_device) + protoAdapter3.encodedSizeWithTag(54, c1esv2.push_params) + protoAdapter3.encodedSizeWithTag(55, c1esv2.real_time_actions) + protoAdapter4.encodedSizeWithTag(56, c1esv2.is_cold_start) + protoAdapter.encodedSizeWithTag(57, c1esv2.batch_num) + protoAdapter.encodedSizeWithTag(58, c1esv2.batch_num_all) + protoAdapter.encodedSizeWithTag(59, c1esv2.play_num) + protoAdapter.encodedSizeWithTag(60, c1esv2.play_num_all) + protoAdapter.encodedSizeWithTag(61, c1esv2.cc_mode) + protoAdapter2.encodedSizeWithTag(62, c1esv2.group_id) + protoAdapter3.encodedSizeWithTag(63, c1esv2.user_action) + protoAdapter3.encodedSizeWithTag(64, c1esv2.inserted_items) + protoAdapter3.encodedSizeWithTag(65, c1esv2.card_insert) + protoAdapter.encodedSizeWithTag(66, c1esv2.feed_source) + C1601740rme.ADAPTER.asRepeated().encodedSizeWithTag(67, c1esv2.insert_relations) + protoAdapter4.encodedSizeWithTag(68, c1esv2.is_non_personalized) + protoAdapter3.encodedSizeWithTag(69, c1esv2.top_view_aid) + protoAdapter.encodedSizeWithTag(70, c1esv2.detail_req) + protoAdapter3.encodedSizeWithTag(71, c1esv2.external_feed_type) + protoAdapter3.encodedSizeWithTag(72, c1esv2.cmpl_enc) + protoAdapter.encodedSizeWithTag(73, c1esv2.carplay_req_source) + protoAdapter3.encodedSizeWithTag(74, c1esv2.ad_extra) + protoAdapter3.encodedSizeWithTag(75, c1esv2.pass_through) + protoAdapter.encodedSizeWithTag(76, c1esv2.is_live_ready) + protoAdapter3.encodedSizeWithTag(77, c1esv2.user_prompt) + protoAdapter.encodedSizeWithTag(78, c1esv2.phoenix_content_type) + protoAdapter3.encodedSizeWithTag(79, c1esv2.mock_info) + protoAdapter4.encodedSizeWithTag(80, c1esv2.is_warm_up_video) + protoAdapter.encodedSizeWithTag(81, c1esv2.allow_sell_data) + protoAdapter3.encodedSizeWithTag(82, c1esv2.language) + protoAdapter.encodedSizeWithTag(83, c1esv2.retry) + protoAdapter.encodedSizeWithTag(84, c1esv2.no_cdn_cache) + protoAdapter3.encodedSizeWithTag(85, c1esv2.channel) + protoAdapter.encodedSizeWithTag(86, c1esv2.use_chunk) + protoAdapter3.encodedSizeWithTag(87, c1esv2.union_version) + protoAdapter3.encodedSizeWithTag(88, c1esv2.bid_ad_params) + protoAdapter3.encodedSizeWithTag(89, c1esv2.carrier_region) + protoAdapter3.encodedSizeWithTag(90, c1esv2.sys_region) + protoAdapter3.encodedSizeWithTag(91, c1esv2.ad_user_agent) + protoAdapter.encodedSizeWithTag(92, c1esv2.is_my_cn) + protoAdapter2.encodedSizeWithTag(93, c1esv2.device_id) + protoAdapter3.encodedSizeWithTag(94, c1esv2.cdid) + protoAdapter.encodedSizeWithTag(95, c1esv2.oid) + protoAdapter4.encodedSizeWithTag(96, c1esv2.is_perf_test) + protoAdapter3.encodedSizeWithTag(97, c1esv2.region) + protoAdapter.encodedSizeWithTag(98, c1esv2.aid) + protoAdapter2.encodedSizeWithTag(99, c1esv2.iid) + protoAdapter3.encodedSizeWithTag(100, c1esv2.build_number) + protoAdapter3.encodedSizeWithTag(101, c1esv2.locale) + protoAdapter3.encodedSizeWithTag(102, c1esv2.device_platform) + protoAdapter3.encodedSizeWithTag(103, c1esv2.device_type) + protoAdapter3.encodedSizeWithTag(104, c1esv2.device_brand) + protoAdapter3.encodedSizeWithTag(105, c1esv2.os_version) + protoAdapter3.encodedSizeWithTag(106, c1esv2.app_name) + protoAdapter3.encodedSizeWithTag(107, c1esv2.ac) + protoAdapter3.encodedSizeWithTag(108, c1esv2.version_code) + protoAdapter3.encodedSizeWithTag(109, c1esv2.version_name) + protoAdapter.encodedSizeWithTag(110, c1esv2.is_pad_autoscroll_on) + protoAdapter3.encodedSizeWithTag(111, c1esv2.app_language) + protoAdapter3.encodedSizeWithTag(112, c1esv2.resolution) + protoAdapter4.encodedSizeWithTag(113, c1esv2.is_tako_branch) + protoAdapter2.encodedSizeWithTag(114, c1esv2.channel_id) + protoAdapter3.encodedSizeWithTag(115, c1esv2.ab_version_param) + protoAdapter2.encodedSizeWithTag(116, c1esv2.update_version_code) + protoAdapter3.encodedSizeWithTag(117, c1esv2.mcc) + protoAdapter3.encodedSizeWithTag(118, c1esv2.mcc_mnc) + protoAdapter3.encodedSizeWithTag(119, c1esv2.residence) + protoAdapter3.encodedSizeWithTag(120, c1esv2.current_region) + protoAdapter3.encodedSizeWithTag(121, c1esv2.account_region) + protoAdapter3.encodedSizeWithTag(122, c1esv2.app_type) + protoAdapter3.encodedSizeWithTag(123, c1esv2.city_name) + protoAdapter3.encodedSizeWithTag(124, c1esv2.province_name) + protoAdapter2.encodedSizeWithTag(125, c1esv2.city_id) + protoAdapter2.encodedSizeWithTag(126, c1esv2.province_id) + protoAdapter2.encodedSizeWithTag(127, c1esv2.province_local_id) + protoAdapter3.encodedSizeWithTag(128, c1esv2.get_params) + protoAdapter3.encodedSizeWithTag(129, c1esv2.post_params) + protoAdapter3.encodedSizeWithTag(130, c1esv2.idfa) + protoAdapter3.encodedSizeWithTag(131, c1esv2.uuid) + protoAdapter3.encodedSizeWithTag(132, c1esv2.openudid) + protoAdapter3.encodedSizeWithTag(133, c1esv2.session_id) + protoAdapter2.encodedSizeWithTag(134, c1esv2.offset) + protoAdapter3.encodedSizeWithTag(135, c1esv2.js_sdk_version) + protoAdapter3.encodedSizeWithTag(136, c1esv2.timezone_offset) + protoAdapter.encodedSizeWithTag(137, c1esv2.has_local_cache) + protoAdapter3.encodedSizeWithTag(138, c1esv2.last_settings_version) + protoAdapter.encodedSizeWithTag(139, c1esv2.is_hot_start) + protoAdapter2.encodedSizeWithTag(140, c1esv2.os_api) + C2224041C2w.ADAPTER.encodedSizeWithTag(141, c1esv2.survey_params) + protoAdapter3.encodedSizeWithTag(142, c1esv2.current_instruction_ids) + protoAdapter2.encodedSizeWithTag(143, c1esv2.last_ad_timestamp) + C1DC8.ADAPTER.encodedSizeWithTag(144, c1esv2.real_time_client_info_v2) + protoAdapter3.encodedSizeWithTag(145, c1esv2.user_avatar_shrink) + protoAdapter3.encodedSizeWithTag(146, c1esv2.session_info) + protoAdapter.encodedSizeWithTag(147, c1esv2.is_new_user_see_first) + protoAdapter3.encodedSizeWithTag(148, c1esv2.inseted_items) + protoAdapter3.encodedSizeWithTag(149, c1esv2.app_version) + protoAdapter3.encodedSizeWithTag(150, c1esv2.search_recommend_info) + protoAdapter2.encodedSizeWithTag(151, c1esv2.search_recommend_timestamp) + protoAdapter.encodedSizeWithTag(152, c1esv2.camera_status) + protoAdapter3.encodedSizeWithTag(153, c1esv2.real_time_client_info) + protoAdapter3.encodedSizeWithTag(154, c1esv2.ssaid) + protoAdapter4.encodedSizeWithTag(155, c1esv2.need_author_affinity) + protoAdapter4.encodedSizeWithTag(156, c1esv2.live_enable_http_dns) + C036N.ADAPTER.encodedSizeWithTag(157, c1esv2.market_info) + C1C0V.ADAPTER.encodedSizeWithTag(158, c1esv2.content_type_statistics) + C1CAL.ADAPTER.encodedSizeWithTag(159, c1esv2.new_user_signal) + protoAdapter2.encodedSizeWithTag(160, c1esv2.ima_app_status) + C2251721DBi.ADAPTER.encodedSizeWithTag(161, c1esv2.feed_initial_params) + C1CNQ.ADAPTER.encodedSizeWithTag(162, c1esv2.client_fcp_config) + protoAdapter4.encodedSizeWithTag(163, c1esv2.disable_quick_mention) + protoAdapter2.asRepeated().encodedSizeWithTag(164, c1esv2.downstream_experiment_filter_ids) + protoAdapter2.encodedSizeWithTag(165, c1esv2.ad_service_ext_version) + protoAdapter2.encodedSizeWithTag(166, c1esv2.ps_ara_status) + C1D9M.ADAPTER.encodedSizeWithTag(167, c1esv2.deleted_live_info) + protoAdapter3.encodedSizeWithTag(168, c1esv2.downstream_experiment_filter_ids_string) + C1D9K.ADAPTER.encodedSizeWithTag(169, c1esv2.live_survey_params) + protoAdapter3.encodedSizeWithTag(170, c1esv2.vod_behavior_string) + C1CHH.ADAPTER.encodedSizeWithTag(171, c1esv2.ttcoin_ad_req_params) + protoAdapter4.encodedSizeWithTag(172, c1esv2.screen_reader_enable) + C760702y5.ADAPTER.encodedSizeWithTag(173, c1esv2.interactive_rec_req_info) + protoAdapter3.encodedSizeWithTag(174, c1esv2.topview_show_info_list) + protoAdapter3.encodedSizeWithTag(175, c1esv2.consumed_cache_ids) + protoAdapter.encodedSizeWithTag(176, c1esv2.att_status) + protoAdapter4.encodedSizeWithTag(177, c1esv2.limit_ad_tracking) + protoAdapter3.encodedSizeWithTag(178, c1esv2.realtime_client_info_v3) + protoAdapter.encodedSizeWithTag(179, c1esv2.request_from) + protoAdapter3.encodedSizeWithTag(180, c1esv2.drm_security_level) + protoAdapter.encodedSizeWithTag(181, c1esv2.realtime_client_info_ttm) + protoAdapter3.encodedSizeWithTag(182, c1esv2.topview_bs_cid) + protoAdapter2.encodedSizeWithTag(183, c1esv2.ad_last_boc_timestamp) + C2229771COx.ADAPTER.encodedSizeWithTag(184, c1esv2.frequency_client_info) + protoAdapter4.encodedSizeWithTag(185, c1esv2.disable_feed_incentive_ads) + protoAdapter3.encodedSizeWithTag(186, c1esv2.outreach_common_condition) + protoAdapter4.encodedSizeWithTag(187, c1esv2.afater_live_cold_start) + C1C0S.ADAPTER.encodedSizeWithTag(188, c1esv2.following_experiment_param) + protoAdapter3.encodedSizeWithTag(189, c1esv2.ole_delivery_info) + protoAdapter4.encodedSizeWithTag(190, c1esv2.shaped_card_gps_authorized) + protoAdapter2.encodedSizeWithTag(191, c1esv2.ec_prefetch_pin_config) + protoAdapter.encodedSizeWithTag(192, c1esv2.need_enter_room_boost) + protoAdapter2.encodedSizeWithTag(193, c1esv2.webcast_sdk_version) + protoAdapter3.encodedSizeWithTag(194, c1esv2.current_network_quality) + protoAdapter.encodedSizeWithTag(195, c1esv2.is_foldable_device) + protoAdapter.encodedSizeWithTag(196, c1esv2.is_folded_mode) + protoAdapter.encodedSizeWithTag(197, c1esv2.is_flippable_device) + protoAdapter.encodedSizeWithTag(198, c1esv2.is_flipped_mode) + protoAdapter.encodedSizeWithTag(199, c1esv2.is_screen_split) + protoAdapter2.encodedSizeWithTag(200, c1esv2.screen_width) + protoAdapter2.encodedSizeWithTag(201, c1esv2.screen_height) + protoAdapter3.encodedSizeWithTag(202, c1esv2.pad_screen_size_type) + protoAdapter.encodedSizeWithTag(203, c1esv2.lite_mode_auto_open) + protoAdapter.encodedSizeWithTag(204, c1esv2.ttplus_ad_mode) + c1esv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1ESV c1esv) {
            C1ESV c1esv2 = c1esv;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1esv2.type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1esv2.max_cursor);
            protoAdapter2.encodeWithTag(protoWriter, 3, c1esv2.min_cursor);
            protoAdapter.encodeWithTag(protoWriter, 4, c1esv2.count);
            protoAdapter.encodeWithTag(protoWriter, 5, c1esv2.feed_style);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1esv2.aweme_id);
            protoAdapter.encodeWithTag(protoWriter, 7, c1esv2.pull_type);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 8, c1esv2.volume);
            protoAdapter.encodeWithTag(protoWriter, 9, c1esv2.need_relieve_aweme);
            protoAdapter.encodeWithTag(protoWriter, 10, c1esv2.address_book_access);
            protoAdapter3.encodeWithTag(protoWriter, 12, c1esv2.top_view_cid);
            protoAdapter3.encodeWithTag(protoWriter, 13, c1esv2.content_language);
            protoAdapter3.encodeWithTag(protoWriter, 14, c1esv2.discard_cids);
            protoAdapter2.encodeWithTag(protoWriter, 15, c1esv2.interest_select_duration);
            protoAdapter3.encodeWithTag(protoWriter, 16, c1esv2.preload_aweme_ids);
            protoAdapter3.encodeWithTag(protoWriter, 17, c1esv2.download_sdk_info);
            protoAdapter.encodeWithTag(protoWriter, 18, c1esv2.cached_item_num);
            protoAdapter.encodeWithTag(protoWriter, 19, c1esv2.last_ad_show_interval);
            protoAdapter3.encodeWithTag(protoWriter, 20, c1esv2.interest_list);
            protoAdapter3.encodeWithTag(protoWriter, 21, c1esv2.preload_live_item_id);
            protoAdapter.encodeWithTag(protoWriter, 22, c1esv2.action_mask);
            protoAdapter3.encodeWithTag(protoWriter, 23, c1esv2.af_params);
            protoAdapter3.encodeWithTag(protoWriter, 25, c1esv2.show_ids);
            protoAdapter3.encodeWithTag(protoWriter, 26, c1esv2.cache_ids);
            protoAdapter3.encodeWithTag(protoWriter, 27, c1esv2.local_cache);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 28, c1esv2.disable_personalization);
            protoAdapter3.encodeWithTag(protoWriter, 29, c1esv2.showtime_gap_req_info);
            protoAdapter.encodeWithTag(protoWriter, 30, c1esv2.client_cache_request_count);
            protoAdapter.encodeWithTag(protoWriter, 31, c1esv2.filter_warn);
            protoAdapter.encodeWithTag(protoWriter, 32, c1esv2.is_audio_mode);
            protoAdapter.encodeWithTag(protoWriter, 33, c1esv2.vpa_content_choice);
            protoAdapter.encodeWithTag(protoWriter, 34, c1esv2.sp);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 35, c1esv2.tail_slot_probability);
            protoAdapter.encodeWithTag(protoWriter, 36, c1esv2.personalization_setting);
            protoAdapter3.encodeWithTag(protoWriter, 37, c1esv2.client_ai_download_json_str);
            protoAdapter3.encodeWithTag(protoWriter, 38, c1esv2.recent_items_from_client);
            protoAdapter3.encodeWithTag(protoWriter, 39, c1esv2.topview_preload_ad_ids);
            protoAdapter2.encodeWithTag(protoWriter, 40, c1esv2.batch_number);
            protoAdapter3.encodeWithTag(protoWriter, 41, c1esv2.aweme_ids);
            protoAdapter3.encodeWithTag(protoWriter, 42, c1esv2.preferred_language);
            protoAdapter3.encodeWithTag(protoWriter, 43, c1esv2.bot_mocked_gids);
            protoAdapter.encodeWithTag(protoWriter, 44, c1esv2.disable_quality_protection);
            protoAdapter3.encodeWithTag(protoWriter, 45, c1esv2.skan_versions);
            protoAdapter3.encodeWithTag(protoWriter, 46, c1esv2.debug_regions);
            protoAdapter3.encodeWithTag(protoWriter, 47, c1esv2.os_boot_time);
            protoAdapter.encodeWithTag(protoWriter, 48, c1esv2.is_landscape);
            protoAdapter.encodeWithTag(protoWriter, 49, c1esv2.is_pad);
            protoAdapter3.encodeWithTag(protoWriter, 50, c1esv2.req_from);
            protoAdapter.encodeWithTag(protoWriter, 51, c1esv2.ad_personality_mode);
            protoAdapter3.encodeWithTag(protoWriter, 52, c1esv2.gaid);
            protoAdapter3.encodeWithTag(protoWriter, 53, c1esv2.sound_output_device);
            protoAdapter3.encodeWithTag(protoWriter, 54, c1esv2.push_params);
            protoAdapter3.encodeWithTag(protoWriter, 55, c1esv2.real_time_actions);
            protoAdapter4.encodeWithTag(protoWriter, 56, c1esv2.is_cold_start);
            protoAdapter.encodeWithTag(protoWriter, 57, c1esv2.batch_num);
            protoAdapter.encodeWithTag(protoWriter, 58, c1esv2.batch_num_all);
            protoAdapter.encodeWithTag(protoWriter, 59, c1esv2.play_num);
            protoAdapter.encodeWithTag(protoWriter, 60, c1esv2.play_num_all);
            protoAdapter.encodeWithTag(protoWriter, 61, c1esv2.cc_mode);
            protoAdapter2.encodeWithTag(protoWriter, 62, c1esv2.group_id);
            protoAdapter3.encodeWithTag(protoWriter, 63, c1esv2.user_action);
            protoAdapter3.encodeWithTag(protoWriter, 64, c1esv2.inserted_items);
            protoAdapter3.encodeWithTag(protoWriter, 65, c1esv2.card_insert);
            protoAdapter.encodeWithTag(protoWriter, 66, c1esv2.feed_source);
            C1601740rme.ADAPTER.asRepeated().encodeWithTag(protoWriter, 67, c1esv2.insert_relations);
            protoAdapter4.encodeWithTag(protoWriter, 68, c1esv2.is_non_personalized);
            protoAdapter3.encodeWithTag(protoWriter, 69, c1esv2.top_view_aid);
            protoAdapter.encodeWithTag(protoWriter, 70, c1esv2.detail_req);
            protoAdapter3.encodeWithTag(protoWriter, 71, c1esv2.external_feed_type);
            protoAdapter3.encodeWithTag(protoWriter, 72, c1esv2.cmpl_enc);
            protoAdapter.encodeWithTag(protoWriter, 73, c1esv2.carplay_req_source);
            protoAdapter3.encodeWithTag(protoWriter, 74, c1esv2.ad_extra);
            protoAdapter3.encodeWithTag(protoWriter, 75, c1esv2.pass_through);
            protoAdapter.encodeWithTag(protoWriter, 76, c1esv2.is_live_ready);
            protoAdapter3.encodeWithTag(protoWriter, 77, c1esv2.user_prompt);
            protoAdapter.encodeWithTag(protoWriter, 78, c1esv2.phoenix_content_type);
            protoAdapter3.encodeWithTag(protoWriter, 79, c1esv2.mock_info);
            protoAdapter4.encodeWithTag(protoWriter, 80, c1esv2.is_warm_up_video);
            protoAdapter.encodeWithTag(protoWriter, 81, c1esv2.allow_sell_data);
            protoAdapter3.encodeWithTag(protoWriter, 82, c1esv2.language);
            protoAdapter.encodeWithTag(protoWriter, 83, c1esv2.retry);
            protoAdapter.encodeWithTag(protoWriter, 84, c1esv2.no_cdn_cache);
            protoAdapter3.encodeWithTag(protoWriter, 85, c1esv2.channel);
            protoAdapter.encodeWithTag(protoWriter, 86, c1esv2.use_chunk);
            protoAdapter3.encodeWithTag(protoWriter, 87, c1esv2.union_version);
            protoAdapter3.encodeWithTag(protoWriter, 88, c1esv2.bid_ad_params);
            protoAdapter3.encodeWithTag(protoWriter, 89, c1esv2.carrier_region);
            protoAdapter3.encodeWithTag(protoWriter, 90, c1esv2.sys_region);
            protoAdapter3.encodeWithTag(protoWriter, 91, c1esv2.ad_user_agent);
            protoAdapter.encodeWithTag(protoWriter, 92, c1esv2.is_my_cn);
            protoAdapter2.encodeWithTag(protoWriter, 93, c1esv2.device_id);
            protoAdapter3.encodeWithTag(protoWriter, 94, c1esv2.cdid);
            protoAdapter.encodeWithTag(protoWriter, 95, c1esv2.oid);
            protoAdapter4.encodeWithTag(protoWriter, 96, c1esv2.is_perf_test);
            protoAdapter3.encodeWithTag(protoWriter, 97, c1esv2.region);
            protoAdapter.encodeWithTag(protoWriter, 98, c1esv2.aid);
            protoAdapter2.encodeWithTag(protoWriter, 99, c1esv2.iid);
            protoAdapter3.encodeWithTag(protoWriter, 100, c1esv2.build_number);
            protoAdapter3.encodeWithTag(protoWriter, 101, c1esv2.locale);
            protoAdapter3.encodeWithTag(protoWriter, 102, c1esv2.device_platform);
            protoAdapter3.encodeWithTag(protoWriter, 103, c1esv2.device_type);
            protoAdapter3.encodeWithTag(protoWriter, 104, c1esv2.device_brand);
            protoAdapter3.encodeWithTag(protoWriter, 105, c1esv2.os_version);
            protoAdapter3.encodeWithTag(protoWriter, 106, c1esv2.app_name);
            protoAdapter3.encodeWithTag(protoWriter, 107, c1esv2.ac);
            protoAdapter3.encodeWithTag(protoWriter, 108, c1esv2.version_code);
            protoAdapter3.encodeWithTag(protoWriter, 109, c1esv2.version_name);
            protoAdapter.encodeWithTag(protoWriter, 110, c1esv2.is_pad_autoscroll_on);
            protoAdapter3.encodeWithTag(protoWriter, 111, c1esv2.app_language);
            protoAdapter3.encodeWithTag(protoWriter, 112, c1esv2.resolution);
            protoAdapter4.encodeWithTag(protoWriter, 113, c1esv2.is_tako_branch);
            protoAdapter2.encodeWithTag(protoWriter, 114, c1esv2.channel_id);
            protoAdapter3.encodeWithTag(protoWriter, 115, c1esv2.ab_version_param);
            protoAdapter2.encodeWithTag(protoWriter, 116, c1esv2.update_version_code);
            protoAdapter3.encodeWithTag(protoWriter, 117, c1esv2.mcc);
            protoAdapter3.encodeWithTag(protoWriter, 118, c1esv2.mcc_mnc);
            protoAdapter3.encodeWithTag(protoWriter, 119, c1esv2.residence);
            protoAdapter3.encodeWithTag(protoWriter, 120, c1esv2.current_region);
            protoAdapter3.encodeWithTag(protoWriter, 121, c1esv2.account_region);
            protoAdapter3.encodeWithTag(protoWriter, 122, c1esv2.app_type);
            protoAdapter3.encodeWithTag(protoWriter, 123, c1esv2.city_name);
            protoAdapter3.encodeWithTag(protoWriter, 124, c1esv2.province_name);
            protoAdapter2.encodeWithTag(protoWriter, 125, c1esv2.city_id);
            protoAdapter2.encodeWithTag(protoWriter, 126, c1esv2.province_id);
            protoAdapter2.encodeWithTag(protoWriter, 127, c1esv2.province_local_id);
            protoAdapter3.encodeWithTag(protoWriter, 128, c1esv2.get_params);
            protoAdapter3.encodeWithTag(protoWriter, 129, c1esv2.post_params);
            protoAdapter3.encodeWithTag(protoWriter, 130, c1esv2.idfa);
            protoAdapter3.encodeWithTag(protoWriter, 131, c1esv2.uuid);
            protoAdapter3.encodeWithTag(protoWriter, 132, c1esv2.openudid);
            protoAdapter3.encodeWithTag(protoWriter, 133, c1esv2.session_id);
            protoAdapter2.encodeWithTag(protoWriter, 134, c1esv2.offset);
            protoAdapter3.encodeWithTag(protoWriter, 135, c1esv2.js_sdk_version);
            protoAdapter3.encodeWithTag(protoWriter, 136, c1esv2.timezone_offset);
            protoAdapter.encodeWithTag(protoWriter, 137, c1esv2.has_local_cache);
            protoAdapter3.encodeWithTag(protoWriter, 138, c1esv2.last_settings_version);
            protoAdapter.encodeWithTag(protoWriter, 139, c1esv2.is_hot_start);
            protoAdapter2.encodeWithTag(protoWriter, 140, c1esv2.os_api);
            C2224041C2w.ADAPTER.encodeWithTag(protoWriter, 141, c1esv2.survey_params);
            protoAdapter3.encodeWithTag(protoWriter, 142, c1esv2.current_instruction_ids);
            protoAdapter2.encodeWithTag(protoWriter, 143, c1esv2.last_ad_timestamp);
            C1DC8.ADAPTER.encodeWithTag(protoWriter, 144, c1esv2.real_time_client_info_v2);
            protoAdapter3.encodeWithTag(protoWriter, 145, c1esv2.user_avatar_shrink);
            protoAdapter3.encodeWithTag(protoWriter, 146, c1esv2.session_info);
            protoAdapter.encodeWithTag(protoWriter, 147, c1esv2.is_new_user_see_first);
            protoAdapter3.encodeWithTag(protoWriter, 148, c1esv2.inseted_items);
            protoAdapter3.encodeWithTag(protoWriter, 149, c1esv2.app_version);
            protoAdapter3.encodeWithTag(protoWriter, 150, c1esv2.search_recommend_info);
            protoAdapter2.encodeWithTag(protoWriter, 151, c1esv2.search_recommend_timestamp);
            protoAdapter.encodeWithTag(protoWriter, 152, c1esv2.camera_status);
            protoAdapter3.encodeWithTag(protoWriter, 153, c1esv2.real_time_client_info);
            protoAdapter3.encodeWithTag(protoWriter, 154, c1esv2.ssaid);
            protoAdapter4.encodeWithTag(protoWriter, 155, c1esv2.need_author_affinity);
            protoAdapter4.encodeWithTag(protoWriter, 156, c1esv2.live_enable_http_dns);
            C036N.ADAPTER.encodeWithTag(protoWriter, 157, c1esv2.market_info);
            C1C0V.ADAPTER.encodeWithTag(protoWriter, 158, c1esv2.content_type_statistics);
            C1CAL.ADAPTER.encodeWithTag(protoWriter, 159, c1esv2.new_user_signal);
            protoAdapter2.encodeWithTag(protoWriter, 160, c1esv2.ima_app_status);
            C2251721DBi.ADAPTER.encodeWithTag(protoWriter, 161, c1esv2.feed_initial_params);
            C1CNQ.ADAPTER.encodeWithTag(protoWriter, 162, c1esv2.client_fcp_config);
            protoAdapter4.encodeWithTag(protoWriter, 163, c1esv2.disable_quick_mention);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 164, c1esv2.downstream_experiment_filter_ids);
            protoAdapter2.encodeWithTag(protoWriter, 165, c1esv2.ad_service_ext_version);
            protoAdapter2.encodeWithTag(protoWriter, 166, c1esv2.ps_ara_status);
            C1D9M.ADAPTER.encodeWithTag(protoWriter, 167, c1esv2.deleted_live_info);
            protoAdapter3.encodeWithTag(protoWriter, 168, c1esv2.downstream_experiment_filter_ids_string);
            C1D9K.ADAPTER.encodeWithTag(protoWriter, 169, c1esv2.live_survey_params);
            protoAdapter3.encodeWithTag(protoWriter, 170, c1esv2.vod_behavior_string);
            C1CHH.ADAPTER.encodeWithTag(protoWriter, 171, c1esv2.ttcoin_ad_req_params);
            protoAdapter4.encodeWithTag(protoWriter, 172, c1esv2.screen_reader_enable);
            C760702y5.ADAPTER.encodeWithTag(protoWriter, 173, c1esv2.interactive_rec_req_info);
            protoAdapter3.encodeWithTag(protoWriter, 174, c1esv2.topview_show_info_list);
            protoAdapter3.encodeWithTag(protoWriter, 175, c1esv2.consumed_cache_ids);
            protoAdapter.encodeWithTag(protoWriter, 176, c1esv2.att_status);
            protoAdapter4.encodeWithTag(protoWriter, 177, c1esv2.limit_ad_tracking);
            protoAdapter3.encodeWithTag(protoWriter, 178, c1esv2.realtime_client_info_v3);
            protoAdapter.encodeWithTag(protoWriter, 179, c1esv2.request_from);
            protoAdapter3.encodeWithTag(protoWriter, 180, c1esv2.drm_security_level);
            protoAdapter.encodeWithTag(protoWriter, 181, c1esv2.realtime_client_info_ttm);
            protoAdapter3.encodeWithTag(protoWriter, 182, c1esv2.topview_bs_cid);
            protoAdapter2.encodeWithTag(protoWriter, 183, c1esv2.ad_last_boc_timestamp);
            C2229771COx.ADAPTER.encodeWithTag(protoWriter, 184, c1esv2.frequency_client_info);
            protoAdapter4.encodeWithTag(protoWriter, 185, c1esv2.disable_feed_incentive_ads);
            protoAdapter3.encodeWithTag(protoWriter, 186, c1esv2.outreach_common_condition);
            protoAdapter4.encodeWithTag(protoWriter, 187, c1esv2.afater_live_cold_start);
            C1C0S.ADAPTER.encodeWithTag(protoWriter, 188, c1esv2.following_experiment_param);
            protoAdapter3.encodeWithTag(protoWriter, 189, c1esv2.ole_delivery_info);
            protoAdapter4.encodeWithTag(protoWriter, 190, c1esv2.shaped_card_gps_authorized);
            protoAdapter2.encodeWithTag(protoWriter, 191, c1esv2.ec_prefetch_pin_config);
            protoAdapter.encodeWithTag(protoWriter, 192, c1esv2.need_enter_room_boost);
            protoAdapter2.encodeWithTag(protoWriter, 193, c1esv2.webcast_sdk_version);
            protoAdapter3.encodeWithTag(protoWriter, 194, c1esv2.current_network_quality);
            protoAdapter.encodeWithTag(protoWriter, 195, c1esv2.is_foldable_device);
            protoAdapter.encodeWithTag(protoWriter, 196, c1esv2.is_folded_mode);
            protoAdapter.encodeWithTag(protoWriter, 197, c1esv2.is_flippable_device);
            protoAdapter.encodeWithTag(protoWriter, 198, c1esv2.is_flipped_mode);
            protoAdapter.encodeWithTag(protoWriter, 199, c1esv2.is_screen_split);
            protoAdapter2.encodeWithTag(protoWriter, 200, c1esv2.screen_width);
            protoAdapter2.encodeWithTag(protoWriter, 201, c1esv2.screen_height);
            protoAdapter3.encodeWithTag(protoWriter, 202, c1esv2.pad_screen_size_type);
            protoAdapter.encodeWithTag(protoWriter, 203, c1esv2.lite_mode_auto_open);
            protoAdapter.encodeWithTag(protoWriter, 204, c1esv2.ttplus_ad_mode);
            protoWriter.writeBytes(c1esv2.unknownFields());
        }
    };
    public String ab_version_param;
    public String ac;
    public String account_region;
    public Integer action_mask;
    public String ad_extra;
    public Long ad_last_boc_timestamp;
    public Integer ad_personality_mode;
    public Long ad_service_ext_version;
    public String ad_user_agent;
    public Integer address_book_access;
    public String af_params;
    public Boolean afater_live_cold_start;
    public Integer aid;
    public Integer allow_sell_data;
    public String app_language;
    public String app_name;
    public String app_type;
    public String app_version;
    public Integer att_status;
    public Long aweme_id;
    public String aweme_ids;
    public Integer batch_num;
    public Integer batch_num_all;
    public Long batch_number;
    public String bid_ad_params;
    public String bot_mocked_gids;
    public String build_number;
    public String cache_ids;
    public Integer cached_item_num;
    public Integer camera_status;
    public String card_insert;
    public Integer carplay_req_source;
    public String carrier_region;
    public Integer cc_mode;
    public String cdid;
    public String channel;
    public Long channel_id;
    public Long city_id;
    public String city_name;
    public String client_ai_download_json_str;
    public Integer client_cache_request_count;
    public C1CNQ client_fcp_config;
    public String cmpl_enc;
    public String consumed_cache_ids;
    public String content_language;
    public C1C0V content_type_statistics;
    public Integer count;
    public String current_instruction_ids;
    public String current_network_quality;
    public String current_region;
    public String debug_regions;
    public C1D9M deleted_live_info;
    public Integer detail_req;
    public String device_brand;
    public Long device_id;
    public String device_platform;
    public String device_type;
    public Boolean disable_feed_incentive_ads;
    public Boolean disable_personalization;
    public Integer disable_quality_protection;
    public Boolean disable_quick_mention;
    public String discard_cids;
    public String download_sdk_info;
    public List<Long> downstream_experiment_filter_ids;
    public String downstream_experiment_filter_ids_string;
    public String drm_security_level;
    public Long ec_prefetch_pin_config;
    public String external_feed_type;
    public C2251721DBi feed_initial_params;
    public Integer feed_source;
    public Integer feed_style;
    public Integer filter_warn;
    public C1C0S following_experiment_param;
    public C2229771COx frequency_client_info;
    public String gaid;
    public String get_params;
    public Long group_id;
    public Integer has_local_cache;
    public String idfa;
    public Long iid;
    public Long ima_app_status;
    public List<C1601740rme> insert_relations;
    public String inserted_items;
    public String inseted_items;
    public C760702y5 interactive_rec_req_info;
    public String interest_list;
    public Long interest_select_duration;
    public Integer is_audio_mode;
    public Boolean is_cold_start;
    public Integer is_flippable_device;
    public Integer is_flipped_mode;
    public Integer is_foldable_device;
    public Integer is_folded_mode;
    public Integer is_hot_start;
    public Integer is_landscape;
    public Integer is_live_ready;
    public Integer is_my_cn;
    public Integer is_new_user_see_first;
    public Boolean is_non_personalized;
    public Integer is_pad;
    public Integer is_pad_autoscroll_on;
    public Boolean is_perf_test;
    public Integer is_screen_split;
    public Boolean is_tako_branch;
    public Boolean is_warm_up_video;
    public String js_sdk_version;
    public String language;
    public Integer last_ad_show_interval;
    public Long last_ad_timestamp;
    public String last_settings_version;
    public Boolean limit_ad_tracking;
    public Integer lite_mode_auto_open;
    public Boolean live_enable_http_dns;
    public C1D9K live_survey_params;
    public String local_cache;
    public String locale;
    public C036N market_info;
    public Long max_cursor;
    public String mcc;
    public String mcc_mnc;
    public Long min_cursor;
    public String mock_info;
    public Boolean need_author_affinity;
    public Integer need_enter_room_boost;
    public Integer need_relieve_aweme;
    public C1CAL new_user_signal;
    public Integer no_cdn_cache;
    public Long offset;
    public Integer oid;
    public String ole_delivery_info;
    public String openudid;
    public Long os_api;
    public String os_boot_time;
    public String os_version;
    public String outreach_common_condition;
    public String pad_screen_size_type;
    public String pass_through;
    public Integer personalization_setting;
    public Integer phoenix_content_type;
    public Integer play_num;
    public Integer play_num_all;
    public String post_params;
    public String preferred_language;
    public String preload_aweme_ids;
    public String preload_live_item_id;
    public Long province_id;
    public Long province_local_id;
    public String province_name;
    public Long ps_ara_status;
    public Integer pull_type;
    public String push_params;
    public String real_time_actions;
    public String real_time_client_info;
    public C1DC8 real_time_client_info_v2;
    public Integer realtime_client_info_ttm;
    public String realtime_client_info_v3;
    public String recent_items_from_client;
    public String region;
    public String req_from;
    public Integer request_from;
    public String residence;
    public String resolution;
    public Integer retry;
    public Long screen_height;
    public Boolean screen_reader_enable;
    public Long screen_width;
    public String search_recommend_info;
    public Long search_recommend_timestamp;
    public String session_id;
    public String session_info;
    public Boolean shaped_card_gps_authorized;
    public String show_ids;
    public String showtime_gap_req_info;
    public String skan_versions;
    public String sound_output_device;
    public Integer sp;
    public String ssaid;
    public C2224041C2w survey_params;
    public String sys_region;
    public Float tail_slot_probability;
    public String timezone_offset;
    public String top_view_aid;
    public String top_view_cid;
    public String topview_bs_cid;
    public String topview_preload_ad_ids;
    public String topview_show_info_list;
    public C1CHH ttcoin_ad_req_params;
    public Integer ttplus_ad_mode;
    public Integer type;
    public String union_version;
    public Long update_version_code;
    public Integer use_chunk;
    public String user_action;
    public String user_avatar_shrink;
    public String user_prompt;
    public String uuid;
    public String version_code;
    public String version_name;
    public String vod_behavior_string;
    public String volume;
    public Integer vpa_content_choice;
    public Long webcast_sdk_version;

    public C1ESV(Integer num, Long l, Long l2, Integer num2, Integer num3, Long l3, Integer num4, String str, Integer num5, Integer num6, String str2, String str3, String str4, Long l4, String str5, String str6, Integer num7, Integer num8, String str7, String str8, Integer num9, String str9, String str10, String str11, String str12, Boolean bool, String str13, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Float f, Integer num15, String str14, String str15, String str16, Long l5, String str17, String str18, String str19, Integer num16, String str20, String str21, String str22, Integer num17, Integer num18, String str23, Integer num19, String str24, String str25, String str26, String str27, Boolean bool2, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Long l6, String str28, String str29, String str30, Integer num25, List<C1601740rme> list, Boolean bool3, String str31, Integer num26, String str32, String str33, Integer num27, String str34, String str35, Integer num28, String str36, Integer num29, String str37, Boolean bool4, Integer num30, String str38, Integer num31, Integer num32, String str39, Integer num33, String str40, String str41, String str42, String str43, String str44, Integer num34, Long l7, String str45, Integer num35, Boolean bool5, String str46, Integer num36, Long l8, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, Integer num37, String str57, String str58, Boolean bool6, Long l9, String str59, Long l10, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, Long l11, Long l12, Long l13, String str68, String str69, String str70, String str71, String str72, String str73, Long l14, String str74, String str75, Integer num38, String str76, Integer num39, Long l15, C2224041C2w c2224041C2w, String str77, Long l16, C1DC8 c1dc8, String str78, String str79, Integer num40, String str80, String str81, String str82, Long l17, Integer num41, String str83, String str84, Boolean bool7, Boolean bool8, C036N c036n, C1C0V c1c0v, C1CAL c1cal, Long l18, C2251721DBi c2251721DBi, C1CNQ c1cnq, Boolean bool9, List<Long> list2, Long l19, Long l20, C1D9M c1d9m, String str85, C1D9K c1d9k, String str86, C1CHH c1chh, Boolean bool10, C760702y5 c760702y5, String str87, String str88, Integer num42, Boolean bool11, String str89, Integer num43, String str90, Integer num44, String str91, Long l21, C2229771COx c2229771COx, Boolean bool12, String str92, Boolean bool13, C1C0S c1c0s, String str93, Boolean bool14, Long l22, Integer num45, Long l23, String str94, Integer num46, Integer num47, Integer num48, Integer num49, Integer num50, Long l24, Long l25, String str95, Integer num51, Integer num52) {
        this(num, l, l2, num2, num3, l3, num4, str, num5, num6, str2, str3, str4, l4, str5, str6, num7, num8, str7, str8, num9, str9, str10, str11, str12, bool, str13, num10, num11, num12, num13, num14, f, num15, str14, str15, str16, l5, str17, str18, str19, num16, str20, str21, str22, num17, num18, str23, num19, str24, str25, str26, str27, bool2, num20, num21, num22, num23, num24, l6, str28, str29, str30, num25, list, bool3, str31, num26, str32, str33, num27, str34, str35, num28, str36, num29, str37, bool4, num30, str38, num31, num32, str39, num33, str40, str41, str42, str43, str44, num34, l7, str45, num35, bool5, str46, num36, l8, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, num37, str57, str58, bool6, l9, str59, l10, str60, str61, str62, str63, str64, str65, str66, str67, l11, l12, l13, str68, str69, str70, str71, str72, str73, l14, str74, str75, num38, str76, num39, l15, c2224041C2w, str77, l16, c1dc8, str78, str79, num40, str80, str81, str82, l17, num41, str83, str84, bool7, bool8, c036n, c1c0v, c1cal, l18, c2251721DBi, c1cnq, bool9, list2, l19, l20, c1d9m, str85, c1d9k, str86, c1chh, bool10, c760702y5, str87, str88, num42, bool11, str89, num43, str90, num44, str91, l21, c2229771COx, bool12, str92, bool13, c1c0s, str93, bool14, l22, num45, l23, str94, num46, num47, num48, num49, num50, l24, l25, str95, num51, num52, ByteString.EMPTY);
    }

    public C1ESV(Integer num, Long l, Long l2, Integer num2, Integer num3, Long l3, Integer num4, String str, Integer num5, Integer num6, String str2, String str3, String str4, Long l4, String str5, String str6, Integer num7, Integer num8, String str7, String str8, Integer num9, String str9, String str10, String str11, String str12, Boolean bool, String str13, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Float f, Integer num15, String str14, String str15, String str16, Long l5, String str17, String str18, String str19, Integer num16, String str20, String str21, String str22, Integer num17, Integer num18, String str23, Integer num19, String str24, String str25, String str26, String str27, Boolean bool2, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Long l6, String str28, String str29, String str30, Integer num25, List<C1601740rme> list, Boolean bool3, String str31, Integer num26, String str32, String str33, Integer num27, String str34, String str35, Integer num28, String str36, Integer num29, String str37, Boolean bool4, Integer num30, String str38, Integer num31, Integer num32, String str39, Integer num33, String str40, String str41, String str42, String str43, String str44, Integer num34, Long l7, String str45, Integer num35, Boolean bool5, String str46, Integer num36, Long l8, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, Integer num37, String str57, String str58, Boolean bool6, Long l9, String str59, Long l10, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, Long l11, Long l12, Long l13, String str68, String str69, String str70, String str71, String str72, String str73, Long l14, String str74, String str75, Integer num38, String str76, Integer num39, Long l15, C2224041C2w c2224041C2w, String str77, Long l16, C1DC8 c1dc8, String str78, String str79, Integer num40, String str80, String str81, String str82, Long l17, Integer num41, String str83, String str84, Boolean bool7, Boolean bool8, C036N c036n, C1C0V c1c0v, C1CAL c1cal, Long l18, C2251721DBi c2251721DBi, C1CNQ c1cnq, Boolean bool9, List<Long> list2, Long l19, Long l20, C1D9M c1d9m, String str85, C1D9K c1d9k, String str86, C1CHH c1chh, Boolean bool10, C760702y5 c760702y5, String str87, String str88, Integer num42, Boolean bool11, String str89, Integer num43, String str90, Integer num44, String str91, Long l21, C2229771COx c2229771COx, Boolean bool12, String str92, Boolean bool13, C1C0S c1c0s, String str93, Boolean bool14, Long l22, Integer num45, Long l23, String str94, Integer num46, Integer num47, Integer num48, Integer num49, Integer num50, Long l24, Long l25, String str95, Integer num51, Integer num52, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.max_cursor = l;
        this.min_cursor = l2;
        this.count = num2;
        this.feed_style = num3;
        this.aweme_id = l3;
        this.pull_type = num4;
        this.volume = str;
        this.need_relieve_aweme = num5;
        this.address_book_access = num6;
        this.top_view_cid = str2;
        this.content_language = str3;
        this.discard_cids = str4;
        this.interest_select_duration = l4;
        this.preload_aweme_ids = str5;
        this.download_sdk_info = str6;
        this.cached_item_num = num7;
        this.last_ad_show_interval = num8;
        this.interest_list = str7;
        this.preload_live_item_id = str8;
        this.action_mask = num9;
        this.af_params = str9;
        this.show_ids = str10;
        this.cache_ids = str11;
        this.local_cache = str12;
        this.disable_personalization = bool;
        this.showtime_gap_req_info = str13;
        this.client_cache_request_count = num10;
        this.filter_warn = num11;
        this.is_audio_mode = num12;
        this.vpa_content_choice = num13;
        this.sp = num14;
        this.tail_slot_probability = f;
        this.personalization_setting = num15;
        this.client_ai_download_json_str = str14;
        this.recent_items_from_client = str15;
        this.topview_preload_ad_ids = str16;
        this.batch_number = l5;
        this.aweme_ids = str17;
        this.preferred_language = str18;
        this.bot_mocked_gids = str19;
        this.disable_quality_protection = num16;
        this.skan_versions = str20;
        this.debug_regions = str21;
        this.os_boot_time = str22;
        this.is_landscape = num17;
        this.is_pad = num18;
        this.req_from = str23;
        this.ad_personality_mode = num19;
        this.gaid = str24;
        this.sound_output_device = str25;
        this.push_params = str26;
        this.real_time_actions = str27;
        this.is_cold_start = bool2;
        this.batch_num = num20;
        this.batch_num_all = num21;
        this.play_num = num22;
        this.play_num_all = num23;
        this.cc_mode = num24;
        this.group_id = l6;
        this.user_action = str28;
        this.inserted_items = str29;
        this.card_insert = str30;
        this.feed_source = num25;
        this.insert_relations = C1516540pZE.LJFF("insert_relations", list);
        this.is_non_personalized = bool3;
        this.top_view_aid = str31;
        this.detail_req = num26;
        this.external_feed_type = str32;
        this.cmpl_enc = str33;
        this.carplay_req_source = num27;
        this.ad_extra = str34;
        this.pass_through = str35;
        this.is_live_ready = num28;
        this.user_prompt = str36;
        this.phoenix_content_type = num29;
        this.mock_info = str37;
        this.is_warm_up_video = bool4;
        this.allow_sell_data = num30;
        this.language = str38;
        this.retry = num31;
        this.no_cdn_cache = num32;
        this.channel = str39;
        this.use_chunk = num33;
        this.union_version = str40;
        this.bid_ad_params = str41;
        this.carrier_region = str42;
        this.sys_region = str43;
        this.ad_user_agent = str44;
        this.is_my_cn = num34;
        this.device_id = l7;
        this.cdid = str45;
        this.oid = num35;
        this.is_perf_test = bool5;
        this.region = str46;
        this.aid = num36;
        this.iid = l8;
        this.build_number = str47;
        this.locale = str48;
        this.device_platform = str49;
        this.device_type = str50;
        this.device_brand = str51;
        this.os_version = str52;
        this.app_name = str53;
        this.ac = str54;
        this.version_code = str55;
        this.version_name = str56;
        this.is_pad_autoscroll_on = num37;
        this.app_language = str57;
        this.resolution = str58;
        this.is_tako_branch = bool6;
        this.channel_id = l9;
        this.ab_version_param = str59;
        this.update_version_code = l10;
        this.mcc = str60;
        this.mcc_mnc = str61;
        this.residence = str62;
        this.current_region = str63;
        this.account_region = str64;
        this.app_type = str65;
        this.city_name = str66;
        this.province_name = str67;
        this.city_id = l11;
        this.province_id = l12;
        this.province_local_id = l13;
        this.get_params = str68;
        this.post_params = str69;
        this.idfa = str70;
        this.uuid = str71;
        this.openudid = str72;
        this.session_id = str73;
        this.offset = l14;
        this.js_sdk_version = str74;
        this.timezone_offset = str75;
        this.has_local_cache = num38;
        this.last_settings_version = str76;
        this.is_hot_start = num39;
        this.os_api = l15;
        this.survey_params = c2224041C2w;
        this.current_instruction_ids = str77;
        this.last_ad_timestamp = l16;
        this.real_time_client_info_v2 = c1dc8;
        this.user_avatar_shrink = str78;
        this.session_info = str79;
        this.is_new_user_see_first = num40;
        this.inseted_items = str80;
        this.app_version = str81;
        this.search_recommend_info = str82;
        this.search_recommend_timestamp = l17;
        this.camera_status = num41;
        this.real_time_client_info = str83;
        this.ssaid = str84;
        this.need_author_affinity = bool7;
        this.live_enable_http_dns = bool8;
        this.market_info = c036n;
        this.content_type_statistics = c1c0v;
        this.new_user_signal = c1cal;
        this.ima_app_status = l18;
        this.feed_initial_params = c2251721DBi;
        this.client_fcp_config = c1cnq;
        this.disable_quick_mention = bool9;
        this.downstream_experiment_filter_ids = C1516540pZE.LJFF("downstream_experiment_filter_ids", list2);
        this.ad_service_ext_version = l19;
        this.ps_ara_status = l20;
        this.deleted_live_info = c1d9m;
        this.downstream_experiment_filter_ids_string = str85;
        this.live_survey_params = c1d9k;
        this.vod_behavior_string = str86;
        this.ttcoin_ad_req_params = c1chh;
        this.screen_reader_enable = bool10;
        this.interactive_rec_req_info = c760702y5;
        this.topview_show_info_list = str87;
        this.consumed_cache_ids = str88;
        this.att_status = num42;
        this.limit_ad_tracking = bool11;
        this.realtime_client_info_v3 = str89;
        this.request_from = num43;
        this.drm_security_level = str90;
        this.realtime_client_info_ttm = num44;
        this.topview_bs_cid = str91;
        this.ad_last_boc_timestamp = l21;
        this.frequency_client_info = c2229771COx;
        this.disable_feed_incentive_ads = bool12;
        this.outreach_common_condition = str92;
        this.afater_live_cold_start = bool13;
        this.following_experiment_param = c1c0s;
        this.ole_delivery_info = str93;
        this.shaped_card_gps_authorized = bool14;
        this.ec_prefetch_pin_config = l22;
        this.need_enter_room_boost = num45;
        this.webcast_sdk_version = l23;
        this.current_network_quality = str94;
        this.is_foldable_device = num46;
        this.is_folded_mode = num47;
        this.is_flippable_device = num48;
        this.is_flipped_mode = num49;
        this.is_screen_split = num50;
        this.screen_width = l24;
        this.screen_height = l25;
        this.pad_screen_size_type = str95;
        this.lite_mode_auto_open = num51;
        this.ttplus_ad_mode = num52;
    }

    @Override // com.squareup.wire.Message
    public C1EST newBuilder() {
        return null;
    }
}
