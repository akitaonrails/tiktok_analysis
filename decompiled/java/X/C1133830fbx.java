package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdkapi.avoidance.setting.LiveDisplayTextSlardarSampleRateSetting;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133830fbx {
    public static final Spannable LIZ = new SpannableString("");
    public static final double LIZIZ = LiveDisplayTextSlardarSampleRateSetting.getValue();

    public static TextPiece LJI(List<TextPiece> list) {
        if (list != null && !list.isEmpty()) {
            for (TextPiece textPiece : list) {
                if (textPiece.type == EnumC1133850fbz.USER.getPieceType()) {
                    return textPiece;
                }
            }
        }
        return null;
    }

    public static int LJII(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C497740JfY.LJFF(R.color.aas);
        }
    }

    public static EnumC1133850fbz LJIIIZ(int i) {
        EnumC1133850fbz enumC1133850fbz = EnumC1133850fbz.HEART;
        if (i == enumC1133850fbz.getPieceType()) {
            return enumC1133850fbz;
        }
        EnumC1133850fbz enumC1133850fbz2 = EnumC1133850fbz.USER;
        if (i == enumC1133850fbz2.getPieceType()) {
            return enumC1133850fbz2;
        }
        EnumC1133850fbz enumC1133850fbz3 = EnumC1133850fbz.STRING;
        if (i == enumC1133850fbz3.getPieceType()) {
            return enumC1133850fbz3;
        }
        EnumC1133850fbz enumC1133850fbz4 = EnumC1133850fbz.GIFT;
        if (i == enumC1133850fbz4.getPieceType()) {
            return enumC1133850fbz4;
        }
        EnumC1133850fbz enumC1133850fbz5 = EnumC1133850fbz.PATTERN_REF;
        if (i == enumC1133850fbz5.getPieceType()) {
            return enumC1133850fbz5;
        }
        EnumC1133850fbz enumC1133850fbz6 = EnumC1133850fbz.IMAGE;
        if (i == enumC1133850fbz6.getPieceType()) {
            return enumC1133850fbz6;
        }
        EnumC1133850fbz enumC1133850fbz7 = EnumC1133850fbz.STRING_REF;
        if (i == enumC1133850fbz7.getPieceType()) {
            return enumC1133850fbz7;
        }
        return EnumC1133850fbz.UNKNOWN;
    }

    public static int LJIIJ(BadgeStruct badgeStruct) {
        int i = badgeStruct.badgeScene;
        if (i != 8 && i != 10 && i != 4 && i != 14) {
            return 0;
        }
        return 1;
    }

    public static boolean LJIIJJI(TextPieceImage textPieceImage) {
        if (textPieceImage != null && textPieceImage.imageModel != null) {
            return !TextUtils.isEmpty(((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).qh0(textPieceImage.imageModel));
        }
        return false;
    }

    public static Spannable LIZ(Spannable spannable, Bitmap bitmap) {
        if (bitmap != null && ((!bitmap.isRecycled() || spannable != null) && spannable.length() != 0)) {
            Context contextLJII = C497740JfY.LJII();
            int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(contextLJII.getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
            C786410Ut5.o2(spannable, new C416760GVu(bitmapDrawable), spannable.length() - 1, spannable.length(), 33);
        }
        return spannable;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Spannable LJIILIIL(com.bytedance.android.livesdk.model.message.common.Text r2, java.lang.String r3) {
        /*
            if (r2 != 0) goto L11
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lb
            android.text.Spannable r0 = X.C1133830fbx.LIZ
            return r0
        Lb:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r3)
            return r0
        L11:
            java.lang.String r0 = r2.key
            if (r0 == 0) goto L3f
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            java.lang.String r0 = r2.key
            r1.getClass()
            java.lang.String r0 = X.C1124870fNV.LIZIZ(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3f
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            java.lang.String r0 = r2.key
            r1.getClass()
            java.lang.String r1 = X.C1124870fNV.LIZIZ(r0)
        L35:
            r0 = 0
            android.text.Spannable r0 = LJIILJJIL(r1, r2, r0)
            android.text.Spannable r1 = X.C1133830fbx.LIZ
            if (r0 == r1) goto L42
            return r0
        L3f:
            java.lang.String r1 = r2.defaultPattern
            goto L35
        L42:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L4d
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r3)
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133830fbx.LJIILIIL(com.bytedance.android.livesdk.model.message.common.Text, java.lang.String):android.text.Spannable");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LJIILLIIL(com.bytedance.android.live.base.model.user.User r14, X.InterfaceC1133840fby r15) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133830fbx.LJIILLIIL(com.bytedance.android.live.base.model.user.User, X.0fby):java.lang.CharSequence");
    }

    public static Spannable LJFF(Text text, List list, Map map) {
        int length;
        TextPieceImage textPieceImage;
        ImageModel imageModel;
        ArrayList<CharSequence> arrayList = (ArrayList) list;
        if (arrayList.size() != 0 && map.size() != 0) {
            if (arrayList.size() != map.size()) {
                C20441214yg.LJ("I18N_MESSAGE", "parse error! mTarget.size() != mTextPieceMap.size()");
                return LIZ;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (CharSequence charSequence : arrayList) {
                if (charSequence != null) {
                    spannableStringBuilder.append(charSequence);
                }
            }
            SpannableString spannableString = new SpannableString(spannableStringBuilder);
            TextFormat textFormat = text.defaultFormat;
            if (textFormat != null && !TextUtils.isEmpty(textFormat.color)) {
                C786410Ut5.o2(spannableString, new ForegroundColorSpan(LJII(textFormat.color)), 0, spannableString.length(), 18);
            }
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                CharSequence charSequence2 = (CharSequence) ListProtector.get(list, i2);
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                TextPiece textPiece = (TextPiece) ((LinkedHashMap) map).get(Integer.valueOf(i2));
                if (textPiece != null && !(textPiece instanceof C1133870fc1)) {
                    int i3 = textPiece.type;
                    EnumC1133850fbz enumC1133850fbz = EnumC1133850fbz.STRING;
                    if (i3 == enumC1133850fbz.getPieceType() && textPiece.format == null) {
                        charSequence2.length();
                        length = charSequence2.length();
                    } else {
                        int i4 = textPiece.type;
                        EnumC1133850fbz enumC1133850fbz2 = EnumC1133850fbz.PATTERN_REF;
                        if (i4 == enumC1133850fbz2.getPieceType() && textPiece.format == null) {
                            charSequence2.length();
                            length = charSequence2.length();
                        } else {
                            TextFormat textFormat2 = textPiece.format;
                            if (textFormat2 == null) {
                                textFormat2 = text.defaultFormat;
                            }
                            if (textPiece.type != enumC1133850fbz.getPieceType() && textPiece.type != enumC1133850fbz2.getPieceType()) {
                                if (textPiece.type == EnumC1133850fbz.USER.getPieceType() && textPiece.userValue != null && textFormat2 != null) {
                                    int iLJII = LJII(textFormat2.color);
                                    C786410Ut5.o2(spannableString, new C1110030ezZ(iLJII, textPiece.userValue.user), i, charSequence2.length() + i, 17);
                                    C786410Ut5.o2(spannableString, new ForegroundColorSpan(iLJII), i, charSequence2.length() + i, 17);
                                    int i5 = textFormat2.weight;
                                    if (i5 > 0) {
                                        C1119920fFW.LJIIIIZZ(spannableString, i, charSequence2.length() + i, 33, i5);
                                    }
                                } else if (textPiece.type == EnumC1133850fbz.GIFT.getPieceType() && textPiece.giftValue != null && (charSequence2 instanceof String)) {
                                    if (charSequence2.toString().indexOf(" . ") >= 0) {
                                        charSequence2.length();
                                    }
                                } else if (textPiece.type == EnumC1133850fbz.HEART.getPieceType() && textPiece.heartValue != null) {
                                    Context contextLJII = C497740JfY.LJII();
                                    if (contextLJII != null && contextLJII.getResources() != null) {
                                        LIZ(spannableString, C1149240g0o.LIZ(contextLJII, LJII(textPiece.heartValue.color), contextLJII.getResources().getDimensionPixelSize(R.dimen.at6), contextLJII.getResources().getDimensionPixelSize(R.dimen.at5)));
                                    }
                                } else if (textPiece.type == EnumC1133850fbz.IMAGE.getPieceType() && (textPieceImage = textPiece.imageValue) != null && (imageModel = textPieceImage.imageModel) != null && !C0IKQ.LIZ(imageModel.getUrls())) {
                                    LJIIIIZZ(null, spannableString, textPiece.imageValue, i, i + 1);
                                }
                            } else {
                                int iLJII2 = LJII(textFormat2.color);
                                Boolean bool = textFormat2.useRemoteColor;
                                if (bool != null && bool.booleanValue()) {
                                    iLJII2 = LJII(textFormat2.color);
                                }
                                C786410Ut5.o2(spannableString, new ForegroundColorSpan(iLJII2), i, charSequence2.length() + i, 17);
                                C1119920fFW.LJIIIIZZ(spannableString, i, charSequence2.length() + i, 33, textFormat2.weight);
                                charSequence2.length();
                            }
                            length = charSequence2.length();
                        }
                    }
                } else {
                    charSequence2.length();
                    length = charSequence2.length();
                }
                i += length;
            }
            return spannableString;
        }
        return LIZ;
    }

    public static Spannable LJIILJJIL(String str, Text text, InterfaceC1133840fby interfaceC1133840fby) {
        if (!TextUtils.isEmpty(str) && text != null) {
            List<TextPiece> list = text.pieces;
            if (list != null && list.size() != 0) {
                try {
                    List<TextPiece> list2 = text.pieces;
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LJIILL(str, list2, arrayList, linkedHashMap, interfaceC1133840fby);
                    if (arrayList.size() > 0 && arrayList.size() == linkedHashMap.size()) {
                        Spannable spannableLJ = LJ(text, arrayList, linkedHashMap, interfaceC1133840fby);
                        LJIIL(str, text, arrayList, linkedHashMap, spannableLJ, "");
                        return spannableLJ;
                    }
                    LJIIL(str, text, arrayList, linkedHashMap, "", "");
                    return LIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIIJ(6, "ttlive_exception", e.getStackTrace());
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    HashMap map = new HashMap();
                    String string = stringWriter.toString();
                    map.put("stack_trace", string);
                    C1CC2.LJII(1, C0KQH.LIZIZ("ttlive_parse_text_status"), map);
                    LJIIL(str, text, null, null, "", string);
                    return LIZ;
                }
            }
            SpannableString spannableString = new SpannableString(str);
            if (interfaceC1133840fby != null) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(interfaceC1133840fby.getColor()), 0, spannableString.length(), 18);
            } else {
                TextFormat textFormat = text.defaultFormat;
                if (textFormat != null && !TextUtils.isEmpty(textFormat.color)) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(LJII(textFormat.color)), 0, spannableString.length(), 18);
                }
            }
            LJIIZILJ(spannableString, 0, spannableString.length(), interfaceC1133840fby, false, -1);
            LJIIL(str, text, null, null, spannableString, "");
            return spannableString;
        }
        LJIIL(str, text, null, null, "", "");
        return LIZ;
    }

    public static void LIZLLL(Spannable spannable, Bitmap bitmap, InterfaceC1133840fby interfaceC1133840fby, boolean z) {
        if (bitmap != null && interfaceC1133840fby != null) {
            int iLastIndexOf = spannable.toString().lastIndexOf(" . ");
            int i = iLastIndexOf + 3;
            int i2 = iLastIndexOf + 1;
            if (!z) {
                i--;
            }
            if (iLastIndexOf != -1) {
                LIZIZ(spannable, bitmap, i2, i, interfaceC1133840fby);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Spannable LJ(com.bytedance.android.livesdk.model.message.common.Text r15, java.util.List<java.lang.CharSequence> r16, java.util.Map<java.lang.Integer, com.bytedance.android.livesdk.model.message.common.TextPiece> r17, X.InterfaceC1133840fby r18) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133830fbx.LJ(com.bytedance.android.livesdk.model.message.common.Text, java.util.List, java.util.Map, X.0fby):android.text.Spannable");
    }

    public static void LIZIZ(Spannable spannable, Bitmap bitmap, int i, int i2, InterfaceC1133840fby interfaceC1133840fby) {
        if (bitmap != null && !bitmap.isRecycled() && spannable != null && spannable.length() != 0 && i >= 0 && i <= spannable.length() && i <= i2) {
            Context contextLJII = C497740JfY.LJII();
            int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(contextLJII.getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
            C786410Ut5.o2(spannable, new C416760GVu(bitmapDrawable), i, i2, 33);
            LJIIZILJ(spannable, i, i2, interfaceC1133840fby, false, -1);
        }
    }

    public static Spannable LIZJ(Spannable spannable, Bitmap bitmap, ImageModel imageModel, int i, int i2) {
        int iLIZIZ;
        int width;
        if (bitmap != null && !bitmap.isRecycled() && spannable != null && spannable.length() != 0 && i >= 0 && i <= spannable.length() && i <= i2 && imageModel != null) {
            Context contextLJII = C497740JfY.LJII();
            if (imageModel.getWidth() != 0 && imageModel.getHeight() != 0) {
                width = (int) C497740JfY.LIZIZ(imageModel.getWidth());
                iLIZIZ = (int) C497740JfY.LIZIZ(imageModel.getHeight());
            } else {
                iLIZIZ = (int) C497740JfY.LIZIZ(20.0f);
                if (bitmap.getHeight() > iLIZIZ) {
                    width = (int) ((iLIZIZ / bitmap.getHeight()) * bitmap.getWidth());
                } else {
                    iLIZIZ = bitmap.getHeight();
                    width = bitmap.getWidth();
                }
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(contextLJII.getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, width, iLIZIZ);
            C786410Ut5.o2(spannable, new C416760GVu(bitmapDrawable), i, i2, 33);
        }
        return spannable;
    }

    public static Spannable LJIIIIZZ(InterfaceC1133840fby interfaceC1133840fby, final Spannable spannable, TextPieceImage textPieceImage, final int i, final int i2) {
        if (interfaceC1133840fby != null && interfaceC1133840fby.LJJLIL()) {
            final WeakReference weakReference = new WeakReference(interfaceC1133840fby);
            final boolean[] zArr = {false};
            ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(textPieceImage.imageModel, new InterfaceC177000m8() { // from class: X.0fc0
                @Override // X.InterfaceC177000m8
                public final void LIZ(Bitmap bitmap) {
                    Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    InterfaceC1133840fby interfaceC1133840fby2 = (InterfaceC1133840fby) weakReference.get();
                    if (interfaceC1133840fby2 != null && zArr[0]) {
                        interfaceC1133840fby2.LJJLIIJ(new C443120HZe<>(bitmapCopy, Integer.valueOf(i), Integer.valueOf(i2)));
                    }
                    if (!zArr[0]) {
                        C1133830fbx.LIZIZ(spannable, bitmapCopy, i, i2, null);
                    }
                }
            });
            zArr[0] = true;
            return spannable;
        }
        if (!LJIIJJI(textPieceImage)) {
            return spannable;
        }
        LIZJ(spannable, BitmapFactory.decodeFile(((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).qh0(textPieceImage.imageModel)), textPieceImage.imageModel, i, i2);
        return spannable;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(java.lang.String r19, java.util.List<com.bytedance.android.livesdk.model.message.common.TextPiece> r20, java.util.List<java.lang.CharSequence> r21, java.util.Map<java.lang.Integer, com.bytedance.android.livesdk.model.message.common.TextPiece> r22, X.InterfaceC1133840fby r23) {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133830fbx.LJIILL(java.lang.String, java.util.List, java.util.List, java.util.Map, X.0fby):void");
    }

    public static void LJIIL(String str, Text text, List<CharSequence> list, Map<Integer, TextPiece> map, CharSequence charSequence, String str2) {
        int size;
        String string;
        String string2;
        if (text != null && AbstractC19994813Le.Default.nextDouble() < LIZIZ) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", text.key);
                jSONObject.put("pattern", str);
                jSONObject.put("default_pattern", text.defaultPattern);
                TextFormat textFormat = text.defaultFormat;
                if (textFormat != null) {
                    jSONObject.put("default_color", textFormat.color);
                    jSONObject.put("default_weight", text.defaultFormat.weight);
                }
                List<TextPiece> list2 = text.pieces;
                if (list2 == null) {
                    size = 0;
                } else {
                    size = list2.size();
                }
                jSONObject.put("piece_count", size);
                jSONObject.put("is_empty", TextUtils.isEmpty(charSequence));
                JSONObject jSONObject2 = new JSONObject();
                if (charSequence == null) {
                    string = "";
                } else {
                    string = charSequence.toString();
                }
                jSONObject2.put("result", string);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject2.put("error_msg", str2);
                }
                if (list != null && !list.isEmpty() && map != null && map.size() == list.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        TextPiece textPiece = map.get(Integer.valueOf(i));
                        if (textPiece != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("piece_");
                            sbLIZ.append(i);
                            sbLIZ.append("_type");
                            jSONObject2.put(C2188811AlT.LIZIZ(sbLIZ), LJIIIZ(textPiece.type).getTag());
                            if (ListProtector.get(list, i) == null) {
                                string2 = "";
                            } else {
                                string2 = ((CharSequence) ListProtector.get(list, i)).toString();
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("piece_");
                            sbLIZ2.append(i);
                            sbLIZ2.append("_text");
                            jSONObject2.put(C2188811AlT.LIZIZ(sbLIZ2), string2);
                            if (textPiece.format != null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("piece_");
                                sbLIZ3.append(i);
                                sbLIZ3.append("_weight");
                                jSONObject2.put(C2188811AlT.LIZIZ(sbLIZ3), textPiece.format.weight);
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("piece_");
                                sbLIZ4.append(i);
                                sbLIZ4.append("_color");
                                jSONObject2.put(C2188811AlT.LIZIZ(sbLIZ4), textPiece.format.color);
                            }
                        }
                    }
                }
                C1CC2.LJIILLIIL("notify_component", "ttlive_livesdk_display_text_parse", jSONObject, jSONObject2, new JSONObject());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJIIZILJ(Spannable spannable, int i, int i2, InterfaceC1133840fby interfaceC1133840fby, boolean z, int i3) {
        C1110050ezb c1110050ezbLJLJL;
        if (interfaceC1133840fby != null && interfaceC1133840fby.LJJJLL()) {
            if (z) {
                c1110050ezbLJLJL = interfaceC1133840fby.LJJJ(i3, interfaceC1133840fby.getUser());
            } else {
                c1110050ezbLJLJL = interfaceC1133840fby.LJLJL(interfaceC1133840fby.getUser());
            }
            C786410Ut5.o2(spannable, c1110050ezbLJLJL, i, i2, 17);
        }
    }
}
