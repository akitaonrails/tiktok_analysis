package X;

import Y.ACListenerS159S0100000_25;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v7.o;

/* JADX INFO: renamed from: X.0uIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698280uIM implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C1698280uIM c1698280uIM, C15O7 c15o7) {
        boolean z;
        C1C7U.LIZ("EffectConfigPresenter@ba9f.initObservable$1$2");
        if (((Boolean) c15o7.LJIIL()).booleanValue()) {
            ((C1622840sKg) c1698280uIM.l0).LIZ((InterfaceC1622450sK3) c1698280uIM.l1);
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("EffectConfigPresenter@ba9f.initObservable$1$2");
        return boolValueOf;
    }

    public static final Object then$1(C1698280uIM c1698280uIM, C15O7 c15o7) {
        if (((AtomicBoolean) c1698280uIM.l0).compareAndSet(false, true)) {
            ((o) c1698280uIM.l1).LIZJ(c15o7);
            return null;
        }
        c15o7.LJIIJJI();
        return null;
    }

    public static final Object then$2(C1698280uIM c1698280uIM, C15O7 c15o7) {
        InterfaceC1638030sjB interfaceC1638030sjB;
        String currentUserId;
        String uid;
        TextView textView;
        LinearLayout linearLayout;
        InterfaceC1638030sjB interfaceC1638030sjB2;
        String string;
        String string2;
        String nickname;
        String string3;
        String nickname2;
        C19518211Xw c19518211Xw;
        InterfaceC1638030sjB interfaceC1638030sjB3;
        C418740GbQ c418740GbQ;
        C1C7U.LIZ("DesignerInfoHandler@c189.updateUser$2");
        if (!c15o7.LJIILIIL() && !c15o7.LJIILL()) {
            interfaceC1638030sjB = (InterfaceC1638030sjB) c15o7.LJIIL();
        } else {
            interfaceC1638030sjB = ((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLJJIJIIJIL.get(((Effect) c1698280uIM.l1).getDesignerId());
        }
        if (interfaceC1638030sjB == null) {
            LinearLayout linearLayout2 = ((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLJILLL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
        } else {
            ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA = (ViewOnClickListenerC1638020sjA) c1698280uIM.l0;
            LinearLayout linearLayout3 = viewOnClickListenerC1638020sjA.LLJZ;
            if (linearLayout3 != null) {
                C786410Ut5.R7(linearLayout3, new View.OnClickListener() { // from class: X.0sjE
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            C418740GbQ c418740GbQ2 = viewOnClickListenerC1638020sjA.LLLF;
            if (c418740GbQ2 != null) {
                C786410Ut5.Ua(c418740GbQ2, new ACListenerS159S0100000_25(viewOnClickListenerC1638020sjA, 84));
            }
            LinearLayout linearLayout4 = viewOnClickListenerC1638020sjA.LLLFF;
            if (linearLayout4 != null) {
                C786410Ut5.R7(linearLayout4, new ACListenerS159S0100000_25(viewOnClickListenerC1638020sjA, 85));
            }
            ((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLJJJJLIIL = interfaceC1638030sjB;
            ViewOnClickListenerC1638020sjA.LLLIL = interfaceC1638030sjB.getUid();
            if (Intrinsics.LJFF((Effect) c1698280uIM.l1, ((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLILZIL.LLILIL())) {
                ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA2 = (ViewOnClickListenerC1638020sjA) c1698280uIM.l0;
                C1322110kVd c1322110kVd = viewOnClickListenerC1638020sjA2.LLLFZ;
                if (c1322110kVd != null) {
                    C786410Ut5.LLZZLLIL(c1322110kVd, 8);
                }
                C19518211Xw c19518211Xw2 = viewOnClickListenerC1638020sjA2.LLLI;
                if (c19518211Xw2 != null) {
                    C786410Ut5.D1(c19518211Xw2, 8);
                }
                C1322110kVd c1322110kVd2 = viewOnClickListenerC1638020sjA2.LLJJJ;
                if (c1322110kVd2 != null) {
                    C786410Ut5.LLZZLLIL(c1322110kVd2, 0);
                }
                C19518211Xw c19518211Xw3 = viewOnClickListenerC1638020sjA2.LLJJJIL;
                if (c19518211Xw3 != null) {
                    C786410Ut5.D1(c19518211Xw3, 0);
                }
                LinearLayout linearLayout5 = viewOnClickListenerC1638020sjA2.LLLFFI;
                if (linearLayout5 != null) {
                    C786410Ut5.LJZL(0, linearLayout5);
                }
                viewOnClickListenerC1638020sjA2.LLJ.LJIIIIZZ();
                InterfaceC1638030sjB interfaceC1638030sjB4 = viewOnClickListenerC1638020sjA2.LLJJJJLIIL;
                boolean z = true;
                if (interfaceC1638030sjB4 != null && !interfaceC1638030sjB4.LIZIZ() && (interfaceC1638030sjB3 = viewOnClickListenerC1638020sjA2.LLJJJJLIIL) != null && !interfaceC1638030sjB3.LIZ() && (c418740GbQ = viewOnClickListenerC1638020sjA2.LLL) != null) {
                    int visibility = c418740GbQ.getVisibility();
                    c418740GbQ.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c418740GbQ);
                }
                InterfaceC1638030sjB interfaceC1638030sjB5 = viewOnClickListenerC1638020sjA2.LLJJJJLIIL;
                Integer numValueOf = null;
                if (interfaceC1638030sjB5 != null) {
                    currentUserId = interfaceC1638030sjB5.getCurrentUserId();
                } else {
                    currentUserId = null;
                }
                InterfaceC1638030sjB interfaceC1638030sjB6 = viewOnClickListenerC1638020sjA2.LLJJJJLIIL;
                if (interfaceC1638030sjB6 != null) {
                    uid = interfaceC1638030sjB6.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(currentUserId, uid) && (c19518211Xw = viewOnClickListenerC1638020sjA2.LLJLILLLLZIIL) != null) {
                    C786410Ut5.D1(c19518211Xw, 8);
                }
                viewOnClickListenerC1638020sjA2.LJIIIIZZ();
                C19518211Xw c19518211Xw4 = viewOnClickListenerC1638020sjA2.LLJJJJJIL;
                String uniqueId = "";
                if (c19518211Xw4 != null) {
                    Locale locale = Locale.getDefault();
                    Context context = viewOnClickListenerC1638020sjA2.LLJJIJI;
                    if (context == null || (string3 = context.getString(2131830073)) == null) {
                        string3 = "";
                    }
                    Object[] objArr = new Object[1];
                    InterfaceC1638030sjB interfaceC1638030sjB7 = viewOnClickListenerC1638020sjA2.LLJJJJLIIL;
                    if (interfaceC1638030sjB7 != null) {
                        nickname2 = interfaceC1638030sjB7.getNickname();
                    } else {
                        nickname2 = null;
                    }
                    objArr[0] = nickname2;
                    c19518211Xw4.setText(C786410Ut5.k4(locale, string3, Arrays.copyOf(objArr, 1)));
                    C786410Ut5.D1(c19518211Xw4, 0);
                }
                C19518211Xw c19518211Xw5 = viewOnClickListenerC1638020sjA2.LLJL;
                if (c19518211Xw5 != null) {
                    InterfaceC1638030sjB interfaceC1638030sjB8 = viewOnClickListenerC1638020sjA2.LLJJJJLIIL;
                    if (interfaceC1638030sjB8 != null) {
                        nickname = interfaceC1638030sjB8.getNickname();
                    } else {
                        nickname = null;
                    }
                    c19518211Xw5.setText(nickname);
                }
                C19518211Xw c19518211Xw6 = viewOnClickListenerC1638020sjA2.LLJLIL;
                if (c19518211Xw6 != null && (interfaceC1638030sjB2 = viewOnClickListenerC1638020sjA2.LLJJJJLIIL) != null) {
                    int followCount = interfaceC1638030sjB2.getFollowCount();
                    if (C1635900sfk.LIZ()) {
                        Context context2 = viewOnClickListenerC1638020sjA2.LLJJIJI;
                        if (context2 == null || (string2 = context2.getString(2131837642)) == null) {
                            string2 = "";
                        }
                        c19518211Xw6.setText(C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{String.valueOf(C19374310qz.LIZ(Integer.valueOf(followCount), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28))}, 1)));
                    } else {
                        Locale locale2 = Locale.getDefault();
                        Context context3 = viewOnClickListenerC1638020sjA2.LLJJIJI;
                        if (context3 == null || (string = context3.getString(2131837642)) == null) {
                            string = "";
                        }
                        Object[] objArr2 = new Object[1];
                        InterfaceC1638030sjB interfaceC1638030sjB9 = viewOnClickListenerC1638020sjA2.LLJJJJLIIL;
                        if (interfaceC1638030sjB9 != null) {
                            numValueOf = Integer.valueOf(interfaceC1638030sjB9.getFollowCount());
                        }
                        objArr2[0] = numValueOf;
                        c19518211Xw6.setText(C786410Ut5.k4(locale2, string, Arrays.copyOf(objArr2, 1)));
                    }
                }
                TextView textView2 = ((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLJJI;
                if (textView2 != null) {
                    textView2.setText(interfaceC1638030sjB.getNickname());
                }
                C19518211Xw c19518211Xw7 = ((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLJJL;
                if (c19518211Xw7 != null) {
                    c19518211Xw7.setText(C786410Ut5.k4(Locale.getDefault(), c19518211Xw7.getContext().getString(2131830075), Arrays.copyOf(new Object[]{interfaceC1638030sjB.getNickname()}, 1)));
                }
                C1324750kZt.LJI(((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLJJLIIIJLLLLLLLZ, interfaceC1638030sjB.getAvatarThumb(), -1, -1);
                ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA3 = (ViewOnClickListenerC1638020sjA) c1698280uIM.l0;
                String designerId = ((Effect) c1698280uIM.l1).getDesignerId();
                String designerEncryptedId = ((Effect) c1698280uIM.l1).getDesignerEncryptedId();
                if (interfaceC1638030sjB.LIZJ() != 1) {
                    z = false;
                }
                C19518211Xw c19518211Xw8 = viewOnClickListenerC1638020sjA3.LLJLILLLLZIIL;
                if (c19518211Xw8 != null) {
                    C786410Ut5.Ta(c19518211Xw8, new ViewOnClickListenerC1631110sY1(viewOnClickListenerC1638020sjA3, designerId, designerEncryptedId, z));
                }
                ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA4 = (ViewOnClickListenerC1638020sjA) c1698280uIM.l0;
                if (viewOnClickListenerC1638020sjA4.LLILLJJLI && (linearLayout = viewOnClickListenerC1638020sjA4.LLJJJJ) != null) {
                    C786410Ut5.LJZL(0, linearLayout);
                }
                C1322110kVd c1322110kVd3 = ((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLJJJ;
                if (c1322110kVd3 != null) {
                    C1324750kZt.LIZJ(c1322110kVd3, (String) C13LP.LJJJLL(((Effect) c1698280uIM.l1).getIconUrl().getUrlList()), -1, -1);
                }
                C19518211Xw c19518211Xw9 = ((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLJJJIL;
                if (c19518211Xw9 != null) {
                    c19518211Xw9.setText(((Effect) c1698280uIM.l1).getName());
                }
                ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA5 = (ViewOnClickListenerC1638020sjA) c1698280uIM.l0;
                if (viewOnClickListenerC1638020sjA5.LLILLJJLI) {
                    C1322110kVd c1322110kVd4 = viewOnClickListenerC1638020sjA5.LLJJ;
                    if (c1322110kVd4 != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd4, 8);
                    }
                } else {
                    C1322110kVd c1322110kVd5 = viewOnClickListenerC1638020sjA5.LLJJ;
                    if (c1322110kVd5 != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd5, 0);
                        C1324750kZt.LJI(c1322110kVd5, interfaceC1638030sjB.getAvatarThumb(), -1, -1);
                    }
                }
                ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA6 = (ViewOnClickListenerC1638020sjA) c1698280uIM.l0;
                if (viewOnClickListenerC1638020sjA6.LL && (textView = viewOnClickListenerC1638020sjA6.LLJJI) != null) {
                    if (TextUtils.isEmpty(interfaceC1638030sjB.getUniqueId())) {
                        if (interfaceC1638030sjB.getShortId() != null) {
                            uniqueId = interfaceC1638030sjB.getShortId();
                        }
                    } else {
                        uniqueId = interfaceC1638030sjB.getUniqueId();
                    }
                    textView.setText(uniqueId);
                }
            }
            ((ViewOnClickListenerC1638020sjA) c1698280uIM.l0).LLJJIJIIJIL.put(((Effect) c1698280uIM.l1).getDesignerId(), interfaceC1638030sjB);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DesignerInfoHandler@c189.updateUser$2");
        return unit;
    }

    public C1698280uIM(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
