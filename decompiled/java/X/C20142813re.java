package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.13re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20142813re {
    public static void LIZJ(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                } else {
                    continue;
                }
            } else {
                i++;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    public static InterfaceC20140813rK LIZ(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                xmlPullParser.require(2, null, "font-family");
                if (xmlPullParser.getName().equals("font-family")) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.FontFamily);
                    String strXd = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.FontFamily_fontProviderAuthority);
                    String strXd2 = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.FontFamily_fontProviderPackage);
                    String strXd3 = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.FontFamily_fontProviderQuery);
                    int resourceId = typedArrayObtainAttributes.getResourceId(R$styleable.FontFamily_fontProviderCerts, 0);
                    int integer = typedArrayObtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchStrategy, 1);
                    int integer2 = typedArrayObtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchTimeout, 500);
                    String strXd4 = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.FontFamily_fontProviderSystemFontFamily);
                    typedArrayObtainAttributes.recycle();
                    if (strXd != null && strXd2 != null && strXd3 != null) {
                        while (xmlPullParser.next() != 3) {
                            LIZJ(xmlPullParser);
                        }
                        return new C20140613rI(new C19968913Bf(strXd, strXd2, strXd3, LIZIZ(resources, resourceId)), integer, integer2, strXd4);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.FontFamilyFont);
                                if (typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_fontWeight)) {
                                    i = R$styleable.FontFamilyFont_fontWeight;
                                } else {
                                    i = R$styleable.FontFamilyFont_android_fontWeight;
                                }
                                int i6 = typedArrayObtainAttributes2.getInt(i, 400);
                                if (typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_fontStyle)) {
                                    i2 = R$styleable.FontFamilyFont_fontStyle;
                                } else {
                                    i2 = R$styleable.FontFamilyFont_android_fontStyle;
                                }
                                if (1 == typedArrayObtainAttributes2.getInt(i2, 0)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_ttcIndex)) {
                                    i3 = R$styleable.FontFamilyFont_ttcIndex;
                                } else {
                                    i3 = R$styleable.FontFamilyFont_android_ttcIndex;
                                }
                                if (typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_fontVariationSettings)) {
                                    i4 = R$styleable.FontFamilyFont_fontVariationSettings;
                                } else {
                                    i4 = R$styleable.FontFamilyFont_android_fontVariationSettings;
                                }
                                String strXd5 = C786410Ut5.Xd(typedArrayObtainAttributes2, i4);
                                int i7 = typedArrayObtainAttributes2.getInt(i3, 0);
                                if (typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_font)) {
                                    i5 = R$styleable.FontFamilyFont_font;
                                } else {
                                    i5 = R$styleable.FontFamilyFont_android_font;
                                }
                                int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                                String strXd6 = C786410Ut5.Xd(typedArrayObtainAttributes2, i5);
                                typedArrayObtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    LIZJ(xmlPullParser);
                                }
                                arrayList.add(new C20141613rS(strXd6, i6, z, i7, resourceId2, strXd5));
                            } else {
                                LIZJ(xmlPullParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new C20141813rU((C20141613rS[]) arrayList.toArray(new C20141613rS[0]));
                }
                LIZJ(xmlPullParser);
                return null;
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> LIZIZ(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                List<List<byte[]>> listEmptyList = Collections.emptyList();
                typedArrayObtainTypedArray.recycle();
                return listEmptyList;
            }
            ArrayList arrayList = new ArrayList();
            if (C20142913rf.LIZ(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            typedArrayObtainTypedArray.recycle();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainTypedArray.recycle();
            throw th;
        }
    }
}
