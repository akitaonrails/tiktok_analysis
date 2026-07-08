package X;

import android.util.Xml;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.13tX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20154513tX {
    public static final HashMap LIZ(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        String[] strArr = new String[1];
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 2) {
            if (eventType != 3) {
                if (eventType != 4) {
                    eventType = xmlPullParserNewPullParser.next();
                    if (eventType == 1) {
                        throw new XmlPullParserException("Unexpected end of document");
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected text: ");
                    sbLIZ.append(xmlPullParserNewPullParser.getText());
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unexpected end tag at: ");
                sbLIZ2.append(xmlPullParserNewPullParser.getName());
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return (HashMap) LIZIZ(xmlPullParserNewPullParser, strArr);
    }

    public static final Object LIZIZ(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int next;
        Object objValueOf = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String strLIZIZ = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 != 1) {
                        if (next2 == 3) {
                            if (xmlPullParser.getName().equals("string")) {
                                strArr[0] = attributeValue;
                                return strLIZIZ;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unexpected end tag in <string>: ");
                            sbLIZ.append(xmlPullParser.getName());
                            throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (next2 == 4) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append(xmlPullParser.getText());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        } else if (next2 == 2) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Unexpected start tag in <string>: ");
                            sbLIZ3.append(xmlPullParser.getName());
                            throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    }
                }
            } else if (name.equals("int")) {
                objValueOf = Integer.valueOf(CastIntegerProtector.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                objValueOf = CastLongProtector.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("float")) {
                objValueOf = CastFloatProtector.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                objValueOf = CastDoubleProtector.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("boolean")) {
                objValueOf = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else {
                if (name.equals("int-array")) {
                    xmlPullParser.next();
                    try {
                        int[] iArr = new int[CastIntegerProtector.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
                        int eventType = xmlPullParser.getEventType();
                        int i = 0;
                        do {
                            if (eventType == 2) {
                                if (xmlPullParser.getName().equals("item")) {
                                    try {
                                        iArr[i] = CastIntegerProtector.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                                    } catch (NullPointerException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw new XmlPullParserException("Need value attribute in item");
                                    } catch (NumberFormatException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        throw new XmlPullParserException("Not a number in value attribute in item");
                                    }
                                } else {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("Expected item tag at: ");
                                    sbLIZ4.append(xmlPullParser.getName());
                                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ4));
                                }
                            } else if (eventType == 3) {
                                if (xmlPullParser.getName().equals("int-array")) {
                                    strArr[0] = attributeValue;
                                    return iArr;
                                }
                                if (xmlPullParser.getName().equals("item")) {
                                    i++;
                                } else {
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("Expected ");
                                    sbLIZ5.append("int-array");
                                    sbLIZ5.append(" end tag at: ");
                                    sbLIZ5.append(xmlPullParser.getName());
                                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ5));
                                }
                            }
                            eventType = xmlPullParser.next();
                        } while (eventType != 1);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Document ended before ");
                        sbLIZ6.append("int-array");
                        sbLIZ6.append(" end tag");
                        throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ6));
                    } catch (NullPointerException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        throw new XmlPullParserException("Need num attribute in byte-array");
                    } catch (NumberFormatException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        throw new XmlPullParserException("Not a number in num attribute in byte-array");
                    }
                }
                if (name.equals("map")) {
                    xmlPullParser.next();
                    HashMap map = new HashMap();
                    int eventType2 = xmlPullParser.getEventType();
                    do {
                        if (eventType2 == 2) {
                            Object objLIZIZ = LIZIZ(xmlPullParser, strArr);
                            String str = strArr[0];
                            if (str != null) {
                                map.put(str, objLIZIZ);
                            } else {
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("Map value without name attribute: ");
                                sbLIZ7.append(xmlPullParser.getName());
                                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ7));
                            }
                        } else if (eventType2 == 3) {
                            if (xmlPullParser.getName().equals("map")) {
                                strArr[0] = attributeValue;
                                return map;
                            }
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("Expected ");
                            sbLIZ8.append("map");
                            sbLIZ8.append(" end tag at: ");
                            sbLIZ8.append(xmlPullParser.getName());
                            throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ8));
                        }
                        eventType2 = xmlPullParser.next();
                    } while (eventType2 != 1);
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("Document ended before ");
                    sbLIZ9.append("map");
                    sbLIZ9.append(" end tag");
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ9));
                }
                if (name.equals("list")) {
                    xmlPullParser.next();
                    ArrayList arrayList = new ArrayList();
                    int eventType3 = xmlPullParser.getEventType();
                    do {
                        if (eventType3 == 2) {
                            arrayList.add(LIZIZ(xmlPullParser, strArr));
                        } else if (eventType3 == 3) {
                            if (xmlPullParser.getName().equals("list")) {
                                strArr[0] = attributeValue;
                                return arrayList;
                            }
                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                            sbLIZ10.append("Expected ");
                            sbLIZ10.append("list");
                            sbLIZ10.append(" end tag at: ");
                            sbLIZ10.append(xmlPullParser.getName());
                            throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ10));
                        }
                        eventType3 = xmlPullParser.next();
                    } while (eventType3 != 1);
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("Document ended before ");
                    sbLIZ11.append("list");
                    sbLIZ11.append(" end tag");
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ11));
                }
                if (name.equals("set")) {
                    xmlPullParser.next();
                    HashSet hashSet = new HashSet();
                    int eventType4 = xmlPullParser.getEventType();
                    do {
                        if (eventType4 == 2) {
                            hashSet.add(LIZIZ(xmlPullParser, strArr));
                        } else if (eventType4 == 3) {
                            if (xmlPullParser.getName().equals("set")) {
                                strArr[0] = attributeValue;
                                return hashSet;
                            }
                            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                            sbLIZ12.append("Expected ");
                            sbLIZ12.append("set");
                            sbLIZ12.append(" end tag at: ");
                            sbLIZ12.append(xmlPullParser.getName());
                            throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ12));
                        }
                        eventType4 = xmlPullParser.next();
                    } while (eventType4 != 1);
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("Document ended before ");
                    sbLIZ13.append("set");
                    sbLIZ13.append(" end tag");
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ13));
                }
                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                sbLIZ14.append("Unknown tag: ");
                sbLIZ14.append(name);
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ14));
            }
        }
        do {
            next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3) {
                    if (xmlPullParser.getName().equals(name)) {
                        strArr[0] = attributeValue;
                        return objValueOf;
                    }
                    StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                    sbLIZ15.append("Unexpected end tag in <");
                    sbLIZ15.append(name);
                    sbLIZ15.append(">: ");
                    sbLIZ15.append(xmlPullParser.getName());
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ15));
                }
                if (next == 4) {
                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                    sbLIZ16.append("Unexpected text in <");
                    sbLIZ16.append(name);
                    sbLIZ16.append(">: ");
                    sbLIZ16.append(xmlPullParser.getName());
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ16));
                }
            } else {
                StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                sbLIZ17.append("Unexpected end of document in <");
                sbLIZ17.append(name);
                sbLIZ17.append(">");
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ17));
            }
        } while (next != 2);
        StringBuilder sbLIZ18 = C2188811AlT.LIZ();
        sbLIZ18.append("Unexpected start tag in <");
        sbLIZ18.append(name);
        sbLIZ18.append(">: ");
        sbLIZ18.append(xmlPullParser.getName());
        throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ18));
    }

    public static final void LIZJ(Map map, C0VSV c0vsv) throws Throwable {
        C20154613tY c20154613tY = new C20154613tY();
        c20154613tY.setOutput(c0vsv, "utf-8");
        c20154613tY.startDocument(null, Boolean.TRUE);
        c20154613tY.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        LIZLLL(map, null, c20154613tY);
        c20154613tY.flush();
    }

    public static final void LIZLLL(Map map, String str, C20154613tY c20154613tY) throws IOException {
        if (map == null) {
            c20154613tY.startTag(null, "null");
            c20154613tY.endTag(null, "null");
            return;
        }
        c20154613tY.startTag(null, "map");
        if (str != null) {
            c20154613tY.attribute(null, "name", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            LJ(entry.getValue(), (String) entry.getKey(), c20154613tY);
        }
        c20154613tY.endTag(null, "map");
    }

    public static final void LJ(Object obj, String str, C20154613tY c20154613tY) throws IOException {
        int i;
        int i2;
        String str2;
        if (obj == null) {
            c20154613tY.startTag(null, "null");
            if (str != null) {
                c20154613tY.attribute(null, "name", str);
            }
            c20154613tY.endTag(null, "null");
            return;
        }
        if (obj instanceof String) {
            c20154613tY.startTag(null, "string");
            if (str != null) {
                c20154613tY.attribute(null, "name", str);
            }
            c20154613tY.text(obj.toString());
            c20154613tY.endTag(null, "string");
            return;
        }
        if (obj instanceof Integer) {
            str2 = "int";
        } else if (obj instanceof Long) {
            str2 = "long";
        } else if (obj instanceof Float) {
            str2 = "float";
        } else if (obj instanceof Double) {
            str2 = "double";
        } else if (obj instanceof Boolean) {
            str2 = "boolean";
        } else {
            int i3 = 0;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                c20154613tY.startTag(null, "byte-array");
                if (str != null) {
                    c20154613tY.attribute(null, "name", str);
                }
                int length = bArr.length;
                c20154613tY.attribute(null, "num", Integer.toString(length));
                StringBuilder sb = new StringBuilder(bArr.length * 2);
                while (i3 < length) {
                    byte b = bArr[i3];
                    int i4 = b >> 4;
                    if (i4 >= 10) {
                        i = (i4 + 97) - 10;
                    } else {
                        i = i4 + 48;
                    }
                    sb.append(i);
                    int i5 = b & 255;
                    if (i5 >= 10) {
                        i2 = (i5 + 97) - 10;
                    } else {
                        i2 = i5 + 48;
                    }
                    sb.append(i2);
                    i3++;
                }
                c20154613tY.text(sb.toString());
                c20154613tY.endTag(null, "byte-array");
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                c20154613tY.startTag(null, "int-array");
                if (str != null) {
                    c20154613tY.attribute(null, "name", str);
                }
                int length2 = iArr.length;
                c20154613tY.attribute(null, "num", Integer.toString(length2));
                while (i3 < length2) {
                    c20154613tY.startTag(null, "item");
                    c20154613tY.attribute(null, "value", Integer.toString(iArr[i3]));
                    c20154613tY.endTag(null, "item");
                    i3++;
                }
                c20154613tY.endTag(null, "int-array");
                return;
            }
            if (obj instanceof Map) {
                LIZLLL((Map) obj, str, c20154613tY);
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                c20154613tY.startTag(null, "list");
                if (str != null) {
                    c20154613tY.attribute(null, "name", str);
                }
                int size = list.size();
                while (i3 < size) {
                    LJ(ListProtector.get(list, i3), null, c20154613tY);
                    i3++;
                }
                c20154613tY.endTag(null, "list");
                return;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                c20154613tY.startTag(null, "set");
                if (str != null) {
                    c20154613tY.attribute(null, "name", str);
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    LJ(it2.next(), null, c20154613tY);
                }
                c20154613tY.endTag(null, "set");
                return;
            }
            if (obj instanceof CharSequence) {
                c20154613tY.startTag(null, "string");
                if (str != null) {
                    c20154613tY.attribute(null, "name", str);
                }
                c20154613tY.text(obj.toString());
                c20154613tY.endTag(null, "string");
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("writeValueXml: unable to write value ");
            sbLIZ.append(obj);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        c20154613tY.startTag(null, str2);
        if (str != null) {
            c20154613tY.attribute(null, "name", str);
        }
        c20154613tY.attribute(null, "value", obj.toString());
        c20154613tY.endTag(null, str2);
    }
}
