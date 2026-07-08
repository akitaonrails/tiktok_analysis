package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.19QR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19QR extends MenuInflater {
    public static final Class<?>[] LJ;
    public static final Class<?>[] LJFF;
    public final Object[] LIZ;
    public final Object[] LIZIZ;
    public final Context LIZJ;
    public Object LIZLLL;

    static {
        Class<?>[] clsArr = {Context.class};
        LJ = clsArr;
        LJFF = clsArr;
    }

    public C19QR(Context context) {
        super(context);
        this.LIZJ = context;
        Object[] objArr = {context};
        this.LIZ = objArr;
        this.LIZIZ = objArr;
    }

    public static Object LIZ(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return LIZ(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof C19QU)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.LIZJ.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C19V6) {
                    C19V6 c19v6 = (C19V6) menu;
                    if (!c19v6.LJIILL) {
                        c19v6.LJJI();
                        z = true;
                    }
                }
                LIZIZ(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((C19V6) menu).LJJ();
                }
                layout.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (z) {
                ((C19V6) menu).LJJ();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    public final void LIZIZ(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        char cCharAt;
        char cCharAt2;
        C19QS c19qs = new C19QS(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    int next = xmlPullParser.next();
                    boolean z = false;
                    boolean z2 = false;
                    String str = null;
                    while (next != 1) {
                        if (next != 2) {
                            if (next == 3) {
                                String name2 = xmlPullParser.getName();
                                if (z2 && name2.equals(str)) {
                                    z2 = false;
                                    str = null;
                                } else if (name2.equals("group")) {
                                    c19qs.LIZIZ = 0;
                                    c19qs.LIZJ = 0;
                                    c19qs.LIZLLL = 0;
                                    c19qs.LJ = 0;
                                    c19qs.LJFF = true;
                                    c19qs.LJI = true;
                                } else if (name2.equals("item")) {
                                    if (!c19qs.LJII) {
                                        AbstractC21548519Ut abstractC21548519Ut = c19qs.LJJIFFI;
                                        if (abstractC21548519Ut != null && abstractC21548519Ut.LIZ()) {
                                            c19qs.LJII = true;
                                            c19qs.LIZIZ(c19qs.LIZ.addSubMenu(c19qs.LIZIZ, c19qs.LJIIIIZZ, c19qs.LJIIIZ, c19qs.LJIIJ).getItem());
                                        } else {
                                            c19qs.LJII = true;
                                            c19qs.LIZIZ(c19qs.LIZ.add(c19qs.LIZIZ, c19qs.LJIIIIZZ, c19qs.LJIIIZ, c19qs.LJIIJ));
                                        }
                                    }
                                } else if (name2.equals("menu")) {
                                    z = true;
                                }
                            }
                        } else if (!z2) {
                            String name3 = xmlPullParser.getName();
                            if (name3.equals("group")) {
                                TypedArray typedArrayObtainStyledAttributes = c19qs.LJJIIZ.LIZJ.obtainStyledAttributes(attributeSet, R$styleable.MenuGroup);
                                c19qs.LIZIZ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MenuGroup_android_id, 0);
                                c19qs.LIZJ = typedArrayObtainStyledAttributes.getInt(R$styleable.MenuGroup_android_menuCategory, 0);
                                c19qs.LIZLLL = typedArrayObtainStyledAttributes.getInt(R$styleable.MenuGroup_android_orderInCategory, 0);
                                c19qs.LJ = typedArrayObtainStyledAttributes.getInt(R$styleable.MenuGroup_android_checkableBehavior, 0);
                                c19qs.LJFF = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_visible, true);
                                c19qs.LJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_enabled, true);
                                typedArrayObtainStyledAttributes.recycle();
                            } else if (name3.equals("item")) {
                                C21411918qr c21411918qrLJIIL = C21411918qr.LJIIL(c19qs.LJJIIZ.LIZJ, attributeSet, R$styleable.MenuItem);
                                c19qs.LJIIIIZZ = c21411918qrLJIIL.LJIIIIZZ(R$styleable.MenuItem_android_id, 0);
                                c19qs.LJIIIZ = (c21411918qrLJIIL.LJII(R$styleable.MenuItem_android_menuCategory, c19qs.LIZJ) & (-65536)) | (c21411918qrLJIIL.LJII(R$styleable.MenuItem_android_orderInCategory, c19qs.LIZLLL) & 65535);
                                c19qs.LJIIJ = c21411918qrLJIIL.LJIIJ(R$styleable.MenuItem_android_title);
                                c19qs.LJIIJJI = c21411918qrLJIIL.LJIIJ(R$styleable.MenuItem_android_titleCondensed);
                                c19qs.LJIIL = c21411918qrLJIIL.LJIIIIZZ(R$styleable.MenuItem_android_icon, 0);
                                String strLJIIIZ = c21411918qrLJIIL.LJIIIZ(R$styleable.MenuItem_android_alphabeticShortcut);
                                if (strLJIIIZ == null) {
                                    cCharAt = 0;
                                } else {
                                    cCharAt = strLJIIIZ.charAt(0);
                                }
                                c19qs.LJIILIIL = cCharAt;
                                c19qs.LJIILJJIL = c21411918qrLJIIL.LJII(R$styleable.MenuItem_alphabeticModifiers, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                                String strLJIIIZ2 = c21411918qrLJIIL.LJIIIZ(R$styleable.MenuItem_android_numericShortcut);
                                if (strLJIIIZ2 == null) {
                                    cCharAt2 = 0;
                                } else {
                                    cCharAt2 = strLJIIIZ2.charAt(0);
                                }
                                c19qs.LJIILL = cCharAt2;
                                c19qs.LJIILLIIL = c21411918qrLJIIL.LJII(R$styleable.MenuItem_numericModifiers, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                                if (c21411918qrLJIIL.LJIIJJI(R$styleable.MenuItem_android_checkable)) {
                                    c19qs.LJIIZILJ = c21411918qrLJIIL.LIZ(R$styleable.MenuItem_android_checkable, false) ? 1 : 0;
                                } else {
                                    c19qs.LJIIZILJ = c19qs.LJ;
                                }
                                c19qs.LJIJ = c21411918qrLJIIL.LIZ(R$styleable.MenuItem_android_checked, false);
                                c19qs.LJIJI = c21411918qrLJIIL.LIZ(R$styleable.MenuItem_android_visible, c19qs.LJFF);
                                c19qs.LJIJJ = c21411918qrLJIIL.LIZ(R$styleable.MenuItem_android_enabled, c19qs.LJI);
                                c19qs.LJIJJLI = c21411918qrLJIIL.LJII(R$styleable.MenuItem_showAsAction, -1);
                                c19qs.LJJI = c21411918qrLJIIL.LJIIIZ(R$styleable.MenuItem_android_onClick);
                                c19qs.LJIL = c21411918qrLJIIL.LJIIIIZZ(R$styleable.MenuItem_actionLayout, 0);
                                c19qs.LJJ = c21411918qrLJIIL.LJIIIZ(R$styleable.MenuItem_actionViewClass);
                                String strLJIIIZ3 = c21411918qrLJIIL.LJIIIZ(R$styleable.MenuItem_actionProviderClass);
                                if (strLJIIIZ3 != null && c19qs.LJIL == 0 && c19qs.LJJ == null) {
                                    c19qs.LJJIFFI = (AbstractC21548519Ut) c19qs.LIZ(strLJIIIZ3, LJFF, c19qs.LJJIIZ.LIZIZ);
                                } else {
                                    c19qs.LJJIFFI = null;
                                }
                                c19qs.LJJII = c21411918qrLJIIL.LJIIJ(R$styleable.MenuItem_contentDescription);
                                c19qs.LJJIII = c21411918qrLJIIL.LJIIJ(R$styleable.MenuItem_tooltipText);
                                if (c21411918qrLJIIL.LJIIJJI(R$styleable.MenuItem_iconTintMode)) {
                                    c19qs.LJJIIJZLJL = C14SQ.LIZJ(c21411918qrLJIIL.LJII(R$styleable.MenuItem_iconTintMode, -1), c19qs.LJJIIJZLJL);
                                } else {
                                    c19qs.LJJIIJZLJL = null;
                                }
                                if (c21411918qrLJIIL.LJIIJJI(R$styleable.MenuItem_iconTint)) {
                                    c19qs.LJJIIJ = c21411918qrLJIIL.LIZIZ(R$styleable.MenuItem_iconTint);
                                } else {
                                    c19qs.LJJIIJ = null;
                                }
                                c21411918qrLJIIL.LJIILJJIL();
                                c19qs.LJII = false;
                            } else if (name3.equals("menu")) {
                                c19qs.LJII = true;
                                SubMenu subMenuAddSubMenu = c19qs.LIZ.addSubMenu(c19qs.LIZIZ, c19qs.LJIIIIZZ, c19qs.LJIIIZ, c19qs.LJIIJ);
                                c19qs.LIZIZ(subMenuAddSubMenu.getItem());
                                LIZIZ(xmlPullParser, attributeSet, subMenuAddSubMenu);
                            } else {
                                str = name3;
                                z2 = true;
                            }
                        }
                        next = xmlPullParser.next();
                        if (z) {
                            return;
                        }
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expecting menu, got ");
                    sbLIZ.append(name);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        throw new RuntimeException("Unexpected end of document");
    }
}
