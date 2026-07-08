package Y;

import X.C0OM1;
import X.C1110604Wa;
import X.C1251150ifB;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1563806Ai;
import X.C16AX;
import X.C16AZ;
import X.C19EG;
import X.C19GS;
import X.C20515515Pl;
import X.C20516215Ps;
import X.C20623915n3;
import X.C20624115n5;
import X.C21648719nx;
import X.C259800zU;
import X.C418440Gaw;
import X.C436200H8o;
import X.C814420VxA;
import X.DialogInterfaceOnDismissListenerC738790SyT;
import X.InterfaceC1427630nFp;
import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes32.dex */
public class ATListenerS350S0200000_31 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS350S0200000_31(final Context context, final C16AZ c16az, int i) {
        this.$t = i;
        this.l1 = c16az;
        this.l0 = new GestureDetector(c16az.LL.getContext(), new C21648719nx() { // from class: X.16Ab
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ == null) {
                    return false;
                }
                C16AZ c16az2 = c16az;
                c16az2.LLILLL.invoke(c16az2.LLIZ, activityLIZ, c16az2.LLILLJJLI);
                c16az.LLJJ = C16AX.CLICKED;
                return true;
            }
        });
    }

    public static final boolean onTouch$0(ATListenerS350S0200000_31 aTListenerS350S0200000_31, View view, MotionEvent motionEvent) {
        float f;
        float fMax;
        if (motionEvent == null) {
            return true;
        }
        ((GestureDetector) aTListenerS350S0200000_31.l0).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else {
                    float rawX = motionEvent.getRawX() - ((C16AZ) aTListenerS350S0200000_31.l1).LLJJIJI;
                    if (Math.abs(rawX) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) {
                        ((C16AZ) aTListenerS350S0200000_31.l1).LLJJ = C16AX.DRAGGING;
                    }
                    C16AZ c16az = (C16AZ) aTListenerS350S0200000_31.l1;
                    if (c16az.LLJJ == C16AX.DRAGGING) {
                        if (c16az.LLJI) {
                            float f2 = c16az.LLJJI;
                            fMax = Math.min(f2, rawX + f2);
                        } else {
                            float f3 = c16az.LLJJI;
                            fMax = Math.max(f3, rawX + f3);
                        }
                        c16az.LLJJIJIIJIL = fMax;
                        C16AZ c16az2 = (C16AZ) aTListenerS350S0200000_31.l1;
                        c16az2.update((int) c16az2.LLJJIJIIJIL, (int) c16az2.LLJJIII, -1, -1);
                    }
                    return true;
                }
            }
            C16AZ c16az3 = (C16AZ) aTListenerS350S0200000_31.l1;
            if (c16az3.LLJJ == C16AX.DRAGGING) {
                c16az3.LLJJ = C16AX.RELEASED;
                if (Math.abs(c16az3.LLJJI - c16az3.LLJJIJIIJIL) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) {
                    C16AZ c16az4 = (C16AZ) aTListenerS350S0200000_31.l1;
                    if (c16az4.LLJI) {
                        f = -c16az4.getContentView().getWidth();
                    } else {
                        f = c16az4.LLILZIL;
                    }
                    final C16AZ c16az5 = (C16AZ) aTListenerS350S0200000_31.l1;
                    c16az5.LJJIIJZLJL(c16az5.LLJJIJIIJIL, f, new InterfaceC1427630nFp() { // from class: X.16Ac
                        @Override // X.InterfaceC1427630nFp
                        public final void LIZ(AbstractC21616419ik<?> abstractC21616419ik, boolean z, float f4, float f5) {
                            c16az5.dismiss();
                        }
                    }).LJIIIZ();
                } else {
                    final C16AZ c16az6 = (C16AZ) aTListenerS350S0200000_31.l1;
                    c16az6.LJJIIJZLJL(c16az6.LLJJIJIIJIL, c16az6.LLJJI, new InterfaceC1427630nFp() { // from class: X.16Aa
                        @Override // X.InterfaceC1427630nFp
                        public final void LIZ(AbstractC21616419ik<?> abstractC21616419ik, boolean z, float f4, float f5) {
                            C16AZ c16az7 = c16az6;
                            if (c16az7.LLILZLL) {
                                Iterator<C21647019ng> it2 = c16az7.LJJIIJ().iterator();
                                while (it2.hasNext()) {
                                    it2.next().LJI(true);
                                }
                                return;
                            }
                            c16az7.LLJJ = C16AX.NO_ACTION;
                        }
                    }).LJIIIZ();
                    return true;
                }
            }
            return true;
        }
        C16AZ c16az7 = (C16AZ) aTListenerS350S0200000_31.l1;
        if (c16az7.LLJJIII == 0.0f || c16az7.LLJJI == 0.0f) {
            c16az7.LLIZ.getLocationOnScreen(new int[2]);
            C16AZ c16az8 = (C16AZ) aTListenerS350S0200000_31.l1;
            c16az8.LLJJI = r2[0];
            c16az8.LLJJIII = r2[1];
        }
        ((C16AZ) aTListenerS350S0200000_31.l1).LLJJIJI = motionEvent.getRawX();
        return true;
    }

    public static final boolean onTouch$1(ATListenerS350S0200000_31 aTListenerS350S0200000_31, View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getAction() == 0) {
            ((C20515515Pl) aTListenerS350S0200000_31.l0).LLIZ = ((C20516215Ps) aTListenerS350S0200000_31.l1).LIZJ(rawX, rawY);
        }
        C20515515Pl c20515515Pl = (C20515515Pl) aTListenerS350S0200000_31.l0;
        boolean z = false;
        if (!c20515515Pl.LLIZ) {
            int[] iArr = new int[2];
            View view2 = c20515515Pl.LLILZ;
            if (view2 == null) {
                view2 = null;
            }
            view2.getLocationOnScreen(iArr);
            z = true;
            motionEvent.offsetLocation(iArr[0], iArr[1]);
            Activity activityLIZ = C1388190mED.LIZ(((C20515515Pl) aTListenerS350S0200000_31.l0).LL);
            if (activityLIZ != null) {
                activityLIZ.dispatchTouchEvent(motionEvent);
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static final boolean onTouch$2(ATListenerS350S0200000_31 aTListenerS350S0200000_31, View view, MotionEvent motionEvent) {
        boolean z;
        String str;
        FragmentManager supportFragmentManager;
        UrlModel cover;
        List<String> urlList;
        String str2;
        FragmentManager supportFragmentManager2;
        UrlModel cover2;
        List<String> urlList2;
        if (!C436200H8o.LJJIIJZLJL(motionEvent.getRawX(), motionEvent.getRawY(), ((C436200H8o) aTListenerS350S0200000_31.l0).LLILZ) && !C436200H8o.LJJIIJZLJL(motionEvent.getRawX(), motionEvent.getRawY(), ((C436200H8o) aTListenerS350S0200000_31.l0).LLILZIL)) {
            return ((C436200H8o) aTListenerS350S0200000_31.l0).LL.getWindow().getDecorView().dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags()));
        }
        if (C1110604Wa.LIZ() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C436200H8o c436200H8o = (C436200H8o) aTListenerS350S0200000_31.l0;
            C19GS c19gs = c436200H8o.LL;
            Aweme aweme = (Aweme) aTListenerS350S0200000_31.l1;
            String str3 = c436200H8o.LLILLJJLI;
            String str4 = c436200H8o.LLILLL;
            C20623915n3 c20623915n3 = new C20623915n3(c19gs, aweme, str3, str4);
            C259800zU c259800zU = new C259800zU();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS556S0100000_12(c259800zU, (C259800zU<TuxSheet>) 902));
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZJ(c20623915n3.LJFF);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIL = c0om1;
            tuxSheet.LLJJJ = null;
            c1390920mIc.LJIIIIZZ(0);
            View view2 = c20623915n3.LJII;
            ?? r10 = c1390920mIc.LIZ;
            r10.LLJJIII = view2;
            r10.LLJLILLLLZIIL = false;
            r10.LLILLJJLI = new DialogInterfaceOnDismissListenerC738790SyT(c20623915n3, 9);
            c259800zU.element = r10;
            C20623915n3.LJIIZILJ = r10;
            Video video = aweme.getVideo();
            if (video == null || (cover2 = video.getCover()) == null || (urlList2 = cover2.getUrlList()) == null || !(!urlList2.isEmpty())) {
                str2 = "";
            } else {
                str2 = (String) ListProtector.get(urlList2, 0);
            }
            c20623915n3.LJIILJJIL.LIZIZ(str2);
            c20623915n3.LJIIJJI.LIZIZ(c20623915n3.LJIILLIIL);
            c20623915n3.LIZIZ();
            c20623915n3.LJIIL.LIZLLL();
            C20624115n5 c20624115n5 = c20623915n3.LJIIL;
            c20624115n5.LJI = new AwS556S0100000_12(c259800zU, (C259800zU<TuxSheet>) 903);
            c20624115n5.LJFF = new AwS432S0200000_31(c20623915n3, (C20623915n3) c259800zU, (C259800zU<TuxSheet>) 121);
            c20623915n3.LIZ();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19gs);
            if (c19egLIZIZ != null && (supportFragmentManager2 = c19egLIZIZ.getSupportFragmentManager()) != null) {
                ((DialogFragment) c259800zU.element).show(supportFragmentManager2, "");
                C1563806Ai.LIZIZ(aweme, str3, str4);
            }
        } else if (C1110604Wa.LIZ() == 4) {
            C436200H8o c436200H8o2 = (C436200H8o) aTListenerS350S0200000_31.l0;
            C19GS c19gs2 = c436200H8o2.LL;
            Aweme aweme2 = (Aweme) aTListenerS350S0200000_31.l1;
            String str5 = c436200H8o2.LLILLJJLI;
            String str6 = c436200H8o2.LLILLL;
            C20623915n3 c20623915n32 = new C20623915n3(c19gs2, aweme2, str5, str6);
            C259800zU c259800zU2 = new C259800zU();
            C1390920mIc c1390920mIc2 = new C1390920mIc(false, 0);
            C0OM1 c0om12 = new C0OM1();
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB2.LIZJ(new AwS556S0100000_12(c259800zU2, (C259800zU<TuxSheet>) 900));
            c0om12.LIZIZ(c1251150ifB2);
            c0om12.LIZJ(c20623915n32.LJFF);
            TuxSheet tuxSheet2 = c1390920mIc2.LIZ;
            tuxSheet2.LLJJIJIL = c0om12;
            tuxSheet2.LLJJJ = null;
            c1390920mIc2.LJIIIIZZ(0);
            View view3 = c20623915n32.LJII;
            ?? r102 = c1390920mIc2.LIZ;
            r102.LLJJIII = view3;
            r102.LLJLILLLLZIIL = false;
            r102.LLILLJJLI = new DialogInterfaceOnDismissListenerC738790SyT(c20623915n32, 8);
            c259800zU2.element = r102;
            C20623915n3.LJIIZILJ = r102;
            Video video2 = aweme2.getVideo();
            if (video2 == null || (cover = video2.getCover()) == null || (urlList = cover.getUrlList()) == null || !(!urlList.isEmpty())) {
                str = "";
            } else {
                str = (String) ListProtector.get(urlList, 0);
            }
            c20623915n32.LJIILJJIL.LIZIZ(str);
            c20623915n32.LJIIJJI.LIZIZ(c20623915n32.LJIILLIIL);
            c20623915n32.LIZJ();
            c20623915n32.LJIIL.LIZLLL();
            C20624115n5 c20624115n52 = c20623915n32.LJIIL;
            c20624115n52.LJI = new AwS556S0100000_12(c259800zU2, (C259800zU<TuxSheet>) 901);
            c20624115n52.LJFF = new AwS432S0200000_31(c20623915n32, (C20623915n3) c259800zU2, (C259800zU<TuxSheet>) 120);
            c20623915n32.LIZ();
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c19gs2);
            if (c19egLIZIZ2 != null && (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) != null) {
                ((DialogFragment) c259800zU2.element).show(supportFragmentManager, "");
                C1563806Ai.LIZIZ(aweme2, str5, str6);
            }
        }
        ((C436200H8o) aTListenerS350S0200000_31.l0).dismiss();
        return true;
    }

    public ATListenerS350S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
