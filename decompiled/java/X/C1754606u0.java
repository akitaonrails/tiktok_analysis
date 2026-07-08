package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeInlineMessageContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06u0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1754606u0 implements InterfaceC1755906uD {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final InterfaceC1755906uD LIZIZ;
    public final String LIZJ;
    public final C01GW LIZLLL;
    public boolean LJ;
    public Boolean LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1115));
    public AnonymousClass0956 LJII;
    public FakeMessage LJIIIIZZ;
    public final C1DW7 LJIIIZ;
    public volatile C1761006v2 LJIIJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1754606u0.class, "fakeMsgModelUtil", "getFakeMsgModelUtil()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/datasource/utils/FakeMsgModelUtil;", 0);
        C13LE.LIZ.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1755906uD
    public final Object LIZIZ(C912530Zr1 c912530Zr1) {
        return this.LIZIZ.LIZIZ(c912530Zr1);
    }

    @Override // X.InterfaceC1755906uD
    public final void LIZJ(long j) {
        this.LIZIZ.LIZJ(j);
    }

    @Override // X.InterfaceC1755906uD
    public final void LJ() {
        this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJFF(C1DW6 c1dw6) {
        this.LIZIZ.LJFF(c1dw6);
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJI() {
        return this.LIZIZ.LJI();
    }

    @Override // X.InterfaceC1755906uD
    public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
        return this.LIZIZ.LJII(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1755906uD
    public final C869590Y9l LJIIIIZZ() {
        return this.LIZIZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJIIIZ() {
        return this.LIZIZ.LJIIIZ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIJ() {
        this.LIZIZ.LJIIJ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIJJI(int i) {
        this.LIZIZ.LJIIJJI(i);
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIL() {
        this.LIZIZ.LJIIL();
    }

    @Override // X.InterfaceC1755906uD
    public final C869590Y9l LJIILJJIL() {
        return this.LIZIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJIJ() {
        return this.LIZIZ.LJIJ();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJJJJI() {
        return this.LIZIZ.LJJJJI();
    }

    @Override // X.InterfaceC1755906uD
    public final int LJJJJIZL() {
        return this.LIZIZ.LJJJJIZL();
    }

    @Override // X.InterfaceC1755906uD
    public final String getConversationId() {
        return this.LIZIZ.getConversationId();
    }

    @Override // X.InterfaceC1755906uD
    public final void refresh() {
        this.LIZIZ.refresh();
    }

    @Override // X.InterfaceC1755906uD
    public final void resume() {
        this.LIZIZ.resume();
    }

    @Override // X.InterfaceC1755906uD
    public final void stop() {
        this.LIZIZ.stop();
    }

    @Override // X.InterfaceC1755906uD
    public final List<C869590Y9l> LIZLLL() {
        ArrayList arrayList = new ArrayList(this.LIZIZ.LIZLLL());
        C1419505h3.LIZ.getClass();
        if (!C1419505h3.LIZLLL || Intrinsics.LJFF(this.LJFF, Boolean.TRUE)) {
            FakeMessage fakeMessage = this.LJIIIIZZ;
            if (fakeMessage == null) {
                return arrayList;
            }
            if (this.LJIIJ == null) {
                synchronized (this) {
                    if (this.LJIIJ == null) {
                        this.LJIIJ = (C1761006v2) C1807670x8n.LLLLLJLJLL();
                    }
                }
            }
            C1755306u7.LIZ(arrayList, fakeMessage, Collections.singletonList(fakeMessage.getUuid()), C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ));
            return arrayList;
        }
        if (this.LJIIIIZZ != null && !this.LJ && !Intrinsics.LJFF(this.LJFF, Boolean.FALSE)) {
            this.LJ = true;
            AnonymousClass0956 anonymousClass0956 = this.LJII;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJII = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C1679206hq(this, null), 2);
        }
        return arrayList;
    }

    @Override // X.InterfaceC1755906uD
    public final void LJJIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZIZ.LJJIZ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LIZ(C1DW6 c1dw6) {
        ((CopyOnWriteArrayList) this.LJIIIZ.LLILLJJLI).add(c1dw6);
    }

    public C1754606u0(InterfaceC1755906uD interfaceC1755906uD, final String str, String str2) {
        this.LIZIZ = interfaceC1755906uD;
        this.LIZJ = str2;
        this.LIZLLL = C452501pT.LIZIZ(new AwS87S1000000_2(str, 26));
        C1DW7 c1dw7 = new C1DW7(new C1DW6() { // from class: X.06Y9
            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Jk(C869590Y9l c869590Y9l, int i) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void LLILZ(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Re(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
            }

            @Override // X.C1DW6
            public final void VD0(C1DW6 c1dw6) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void mf(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void nc(List<? extends C869590Y9l> list) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void ns(String str3) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void su(C869590Y9l c869590Y9l, boolean z) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void u6(List<C869590Y9l> list, boolean z) {
            }

            @Override // X.C1DW6
            public final void yf1(C1DW6 c1dw6) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void a(int i, String str3, List list, Long l) {
                FakeMessage fakeMessage;
                if (list != null) {
                    String str4 = str;
                    C1754606u0 c1754606u0 = this;
                    if (list.size() >= 10) {
                        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
                        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(c0ysq).LIZ(str4);
                        if (c0y8tLIZ != null && c0y8tLIZ.getUnreadCount() == 0) {
                            C0ZFW c0zfw = C0ZFW.LIZ;
                            if (!c0zfw.LJII(str4)) {
                                C06YA c06ya = (C06YA) c1754606u0.LIZLLL.getValue();
                                Keva keva = c06ya.LIZIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("key_inline_msg_show_times");
                                sbLIZ.append(c06ya.LIZ);
                                if (keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) < 3) {
                                    Keva keva2 = c06ya.LIZIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("key_inline_msg_show_time");
                                    sbLIZ2.append(c06ya.LIZ);
                                    if (System.currentTimeMillis() - keva2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 1L) > 2592000000L && c0zfw.LJIIIZ(C0YSQ.LIZIZ(c0ysq).LIZ(str4))) {
                                        C06YA c06ya2 = (C06YA) c1754606u0.LIZLLL.getValue();
                                        Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
                                        c06ya2.getClass();
                                        C0Y8T c0y8tLIZ2 = C0YSQ.LIZIZ(c0ysq).LIZ(c06ya2.LIZ);
                                        if (c0y8tLIZ2 == null) {
                                            fakeMessage = new FakeMessage();
                                        } else {
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            Keva keva3 = c06ya2.LIZIZ;
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("key_inline_msg_show_time");
                                            sbLIZ3.append(c06ya2.LIZ);
                                            keva3.storeLong(C2188811AlT.LIZIZ(sbLIZ3), jCurrentTimeMillis);
                                            Keva keva4 = c06ya2.LIZIZ;
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("key_inline_msg_show_times");
                                            sbLIZ4.append(c06ya2.LIZ);
                                            int i2 = keva4.getInt(C2188811AlT.LIZIZ(sbLIZ4), 0);
                                            Keva keva5 = c06ya2.LIZIZ;
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("key_inline_msg_show_times");
                                            sbLIZ5.append(c06ya2.LIZ);
                                            keva5.storeInt(C2188811AlT.LIZIZ(sbLIZ5), i2 + 1);
                                            FakeInlineMessageContent fakeInlineMessageContent = new FakeInlineMessageContent(c0y8tLIZ2.getLastMessageOrderIndex(), 15, applicationContext.getString(2131835213), C786410Ut5.j4(applicationContext.getString(2131835212), Arrays.copyOf(new Object[]{applicationContext.getString(2131835213)}, 1)), "");
                                            FakeMessage.Builder builder = new FakeMessage.Builder();
                                            builder.setFakeContent(fakeInlineMessageContent);
                                            builder.msgType(4010);
                                            builder.orderIndex(fakeInlineMessageContent.getPreviousMsgOrderIndex());
                                            C869590Y9l c869590Y9lBuild = builder.build();
                                            c869590Y9lBuild.setConversationId(c0y8tLIZ2.getConversationId());
                                            c869590Y9lBuild.setIndex(c0y8tLIZ2.getLastMessageIndex() + 1);
                                            fakeMessage = (FakeMessage) c869590Y9lBuild;
                                        }
                                        c1754606u0.LJIIIIZZ = fakeMessage;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
        this.LJIIIZ = c1dw7;
        interfaceC1755906uD.LIZ(c1dw7);
    }
}
