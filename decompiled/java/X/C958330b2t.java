package X;

import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.BattleOptPair;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958330b2t extends AbstractC960400b6E<C958360b2w> implements InterfaceC958380b2y {
    public static final /* synthetic */ int LLJJIII = 0;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final List<View> LLJ;
    public final List<C1099610eil> LLJI;
    public final List<TextView> LLJIJIL;
    public final List<C1324720kZq> LLJILJIL;
    public final C958290b2p LLJILJILJ;
    public C958420b32 LLJILLL;
    public boolean LLJJ;
    public final ACListenerS150S0100000_15 LLJJI;

    @Override // X.AbstractC960400b6E
    public final void LLIILZL() {
        this.LL = false;
        C958290b2p c958290b2p = this.LLJILJILJ;
        c958290b2p.getClass();
        C915980Zwa.LJII().LJJLIIIJL(C954930axP.class, c958290b2p.LJI);
        c958290b2p.LJII.LJFF.removeCallbacksAndMessages(null);
    }

    @Override // X.AbstractC960400b6E
    public final String getName() {
        return "BattlePairViewHolder";
    }

    public final C16FS S5() {
        return (C16FS) this.LLIZLLLIL.getValue();
    }

    public final C16F5 T5() {
        return (C16F5) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC958380b2y
    public final Context context() {
        return this.itemView.getContext();
    }

    public final String P5() {
        CharSequence text;
        String string;
        C16FS c16fsS5 = S5();
        if (c16fsS5 == null || (text = c16fsS5.getText()) == null || (string = text.toString()) == null) {
            C20441214yg.LJIIL("BattlePairViewBinder", "Button text is null or empty");
            return "";
        }
        if (Intrinsics.LJFF(string, C497740JfY.LJIJI(2131843982))) {
            return "invite all";
        }
        if (Intrinsics.LJFF(string, C497740JfY.LJIJI(2131843981))) {
            return "invite";
        }
        if (Intrinsics.LJFF(string, C497740JfY.LJIJI(2131843984))) {
            return "withdraw";
        }
        if (Intrinsics.LJFF(string, C497740JfY.LJIJI(2131843983))) {
            return "join";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unmapped button text: ");
        sbLIZ.append(string);
        C20441214yg.LJIIL("BattlePairViewBinder", C2188811AlT.LIZIZ(sbLIZ));
        return "";
    }

    @Override // X.InterfaceC958380b2y
    public final void LLZ(List<C958400b30> list) {
        int i;
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ImageModel avatarThumb = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C958400b30 c958400b30 = (C958400b30) next;
                    int i5 = 8;
                    if (!c958400b30.LIZ) {
                        View view = (View) C13LP.LJJJLZIJ(i3, this.LLJ);
                        if (view != null) {
                            C786410Ut5.LJLLLLLL(8, view);
                        }
                    } else {
                        View view2 = (View) C13LP.LJJJLZIJ(i3, this.LLJ);
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(0, view2);
                            C786410Ut5.I7(new ACListenerS118S0200000_15(this, c958400b30, 37), view2);
                        }
                        ImageView imageView = (ImageView) C13LP.LJJJLZIJ(i3, this.LLJI);
                        if (imageView != null) {
                            User owner = c958400b30.LIZIZ.getOwner();
                            if (owner != null) {
                                avatarThumb = owner.getAvatarThumb();
                            }
                            C1121670fIL.LJIILIIL(imageView, avatarThumb, imageView.getWidth(), imageView.getHeight(), R.drawable.el_);
                        }
                        C1324720kZq c1324720kZq = (C1324720kZq) C13LP.LJJJLZIJ(i3, this.LLJILJIL);
                        if (c1324720kZq != null) {
                            if (c958400b30.LIZJ) {
                                i5 = 0;
                            }
                            C786410Ut5.LLJJIII(c1324720kZq, i5);
                        }
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if (!arrayList.isEmpty()) {
                    C118300cf c118300cf = new C118300cf();
                    int length = -1;
                    c118300cf.element = -1;
                    ArrayList arrayList2 = new ArrayList();
                    int i6 = 0;
                    for (Object obj : arrayList) {
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            String strLIZ = C0KVU.LIZ(((C958400b30) obj).LIZIZ.getOwner());
                            if (strLIZ.length() > length) {
                                length = strLIZ.length();
                                c118300cf.element = i6;
                            }
                            arrayList2.add(strLIZ);
                            i6 = i7;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (length > 0 && (i = c118300cf.element) >= 0) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            TextView textView = (TextView) C13LP.LJJJLZIJ(i, this.LLJIJIL);
                            if (textView != null) {
                                View view3 = (View) C13LP.LJJJLZIJ(c118300cf.element, this.LLJ);
                                if (view3 != null) {
                                    C434890H3n c434890H3n = new C434890H3n(textView, arrayList2, c118300cf, view3, this);
                                    if (view3.getMeasuredWidth() <= 0) {
                                        HandlerHook.viewPost(view3, new ARunnableS106S0100000_6((Object) c434890H3n, 210));
                                        return;
                                    } else {
                                        c434890H3n.invoke();
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        for (Object obj2 : (ArrayList) this.LLJIJIL) {
                            int i8 = i2 + 1;
                            if (i2 >= 0) {
                                ((TextView) obj2).setText((CharSequence) C13LP.LJJJLZIJ(i2, arrayList2));
                                i2 = i8;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error: updateAnchorNameView maxCount:");
                    sbLIZ.append(length);
                    sbLIZ.append(", maxIndex:");
                    sbLIZ.append(c118300cf.element);
                    C958370b2x.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
        }
    }

    public final void N5(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (z) {
            View view = (View) this.LLILZ.getValue();
            if (view != null && (!this.LLJJ)) {
                HandlerHook.viewPost(view, new ARunnableS115S0100000_15(this, 135));
            }
            this.LLJJ = true;
            return;
        }
        View view2 = (View) this.LLILZ.getValue();
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.width = -2;
        }
        this.LLJJ = false;
    }

    public final String R5(boolean z) {
        Map linkedHashMap;
        int i;
        BattleOptPair battleOptPair;
        if (z) {
            int iLIZ = this.LLJILJILJ.LIZ();
            C958360b2w c958360b2w = this.LLJILJILJ.LIZIZ;
            if (c958360b2w == null || (battleOptPair = c958360b2w.LJ) == null || (linkedHashMap = battleOptPair.isInLinkmic) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (true) {
                i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                long jLongValue = ((Number) it2.next()).longValue();
                if (Intrinsics.LJFF(linkedHashMap.get(Long.valueOf(jLongValue)), Boolean.TRUE)) {
                    Number numberLJIIJ = C930540aK4.LJIIJ();
                    if (numberLJIIJ == null) {
                        numberLJIIJ = 0;
                    }
                    if ((numberLJIIJ instanceof Long) && jLongValue == numberLJIIJ.longValue()) {
                        i = 1;
                        break;
                    }
                }
            }
            if (iLIZ - (i ^ 1) > 1) {
                return C497740JfY.LJIJI(2131843982);
            }
            return C497740JfY.LJIJI(2131843981);
        }
        return C497740JfY.LJIJI(2131843983);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0b32, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void U5(final C958360b2w c958360b2w) {
        boolean z;
        long j;
        String strLJIIJ;
        OptPairInfo optPairInfo = c958360b2w.LJ.optPairInfo;
        if (optPairInfo != null && optPairInfo.optPairStatus == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C11JF c11jf = C958390b2z.LIZ;
            C958420b32 c958420b32 = this.LLJILLL;
            if (c958420b32 != null) {
                C958390b2z.LIZIZ.remove(c958420b32);
            }
            this.LLJILLL = null;
            C16F5 c16f5T5 = T5();
            if (c16f5T5 != null) {
                c16f5T5.setText(C497740JfY.LJIJI(2131840933));
            }
            C16F5 c16f5T52 = T5();
            if (c16f5T52 != null) {
                c16f5T52.setTextColor(C497740JfY.LIZLLL(R.attr.fxf, context()));
            }
            N5(false);
            return;
        }
        if (optPairInfo != null) {
            j = optPairInfo.expectedTimeSec;
        } else {
            j = 0;
        }
        long jLIZJ = j - C158B.LIZJ();
        if (jLIZJ <= 0) {
            C11JF c11jf2 = C958390b2z.LIZ;
            C958420b32 c958420b322 = this.LLJILLL;
            if (c958420b322 != null) {
                C958390b2z.LIZIZ.remove(c958420b322);
            }
            this.LLJILLL = null;
            C16F5 c16f5T53 = T5();
            if (c16f5T53 != null) {
                c16f5T53.setText(C497740JfY.LJIJI(2131840936));
            }
            C16F5 c16f5T54 = T5();
            if (c16f5T54 != null) {
                c16f5T54.setTextColor(C497740JfY.LIZLLL(R.attr.fxc, context()));
            }
            N5(false);
            return;
        }
        C16F5 c16f5T55 = T5();
        if (c16f5T55 != null) {
            if (jLIZJ >= 3600) {
                SimpleDateFormat simpleDateFormat = C963140bAe.LIZ;
                StringBuilder sb = new StringBuilder();
                long j2 = jLIZJ / 3600;
                long j3 = (jLIZJ - (3600 * j2)) / 60;
                if (j2 < 10) {
                    sb.append(CardStruct.IStatusCode.DEFAULT);
                }
                sb.append(j2);
                sb.append(":");
                if (j3 < 10) {
                    sb.append(CardStruct.IStatusCode.DEFAULT);
                }
                sb.append(j3);
                strLJIIJ = sb.toString();
            } else {
                strLJIIJ = C963140bAe.LJIIJ(jLIZJ);
            }
            c16f5T55.setText(strLJIIJ);
        }
        C16F5 c16f5T56 = T5();
        if (c16f5T56 != null) {
            c16f5T56.setTextColor(C497740JfY.LIZLLL(R.attr.fxf, context()));
        }
        N5(true);
        if (this.LLJILLL == null) {
            ?? r1 = new InterfaceC958430b33() { // from class: X.0b32
                @Override // X.InterfaceC958430b33
                public final void LIZ() {
                    this.LIZ.U5(c958360b2w);
                }
            };
            this.LLJILLL = r1;
            C958390b2z.LIZIZ.add((InterfaceC958430b33) r1);
            C11JF c11jf3 = C958390b2z.LIZ;
            if (c11jf3 != null && !c11jf3.isDisposed()) {
                return;
            }
            C958390b2z.LIZ = (C11JF) C11NZ.LJJJJL(1L, 1L, TimeUnit.SECONDS, C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0b2v
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CountDownHelper@1931.initCountDownDisposable$1");
                    Iterator<InterfaceC958430b33> it2 = C958390b2z.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                    C1C7U.LIZIZ("CountDownHelper@1931.initCountDownDisposable$1");
                }
            });
        }
    }

    @Override // X.InterfaceC958380b2y
    public final void w(EnumC955720ayg enumC955720ayg, boolean z) {
        if (enumC955720ayg == EnumC955720ayg.UNAVAILABLE) {
            C16FS c16fsS5 = S5();
            if (c16fsS5 != null) {
                c16fsS5.setText(R5(z));
            }
            C16FS c16fsS52 = S5();
            if (c16fsS52 != null) {
                c16fsS52.setBackgroundResource(R.drawable.dvg);
            }
            C16FS c16fsS53 = S5();
            if (c16fsS53 != null) {
                c16fsS53.setTextColor(C497740JfY.LIZLLL(R.attr.fxg, context()));
            }
            C16FS c16fsS54 = S5();
            if (c16fsS54 != null) {
                c16fsS54.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fsS55 = S5();
        if (c16fsS55 != null) {
            C786410Ut5.h8(c16fsS55, this.LLJJI);
        }
        C16FS c16fsS56 = S5();
        if (c16fsS56 != null) {
            c16fsS56.setEnabled(true);
        }
        if (enumC955720ayg == EnumC955720ayg.INVITING) {
            C16FS c16fsS57 = S5();
            if (c16fsS57 != null) {
                c16fsS57.setText(C497740JfY.LJIJI(2131843984));
            }
            C16FS c16fsS58 = S5();
            if (c16fsS58 != null) {
                c16fsS58.setBackgroundResource(R.drawable.dvg);
            }
            C16FS c16fsS59 = S5();
            if (c16fsS59 != null) {
                c16fsS59.setTextColor(C497740JfY.LIZLLL(R.attr.fxc, context()));
                return;
            }
            return;
        }
        C16FS c16fsS510 = S5();
        if (c16fsS510 != null) {
            c16fsS510.setText(R5(z));
        }
        C16FS c16fsS511 = S5();
        if (c16fsS511 != null) {
            c16fsS511.setBackgroundResource(R.drawable.dvh);
        }
        C16FS c16fsS512 = S5();
        if (c16fsS512 != null) {
            c16fsS512.setTextColor(C497740JfY.LIZLLL(R.attr.c9n, context()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x028e  */
    @Override // X.AbstractC960400b6E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(java.util.List r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C958330b2t.I5(java.util.List, int, java.lang.Object):void");
    }

    public C958330b2t(View view, InterfaceC956060azE interfaceC956060azE, InterfaceC956210azT interfaceC956210azT, DataChannel dataChannel) {
        super(view);
        this.LLILZ = C1935407i4.LIZ(new AwS559S0100000_15(view, 688));
        this.LLILZIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 689));
        this.LLILZLL = C1935407i4.LIZ(new AwS559S0100000_15(view, 686));
        this.LLIZ = C1935407i4.LIZ(new AwS559S0100000_15(view, 685));
        this.LLIZLLLIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 687));
        this.LLJ = new ArrayList();
        this.LLJI = new ArrayList();
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = new C958290b2p(this, dataChannel, interfaceC956060azE, interfaceC956210azT);
        this.LLJJI = new ACListenerS150S0100000_15(this, 223);
    }
}
