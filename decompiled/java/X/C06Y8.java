package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeInlineMessageContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.06Y8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.data.datasource.StreakInlineMsgModel$createFakeMsg$1", f = "StreakInlineMsgModel.kt", l = {}, m = "invokeSuspend")
public final class C06Y8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06YD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Y8(C06YD c06yd, InterfaceC1364105Vn<? super C06Y8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06yd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06Y8(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String string;
        int i;
        IStreakService iStreakService;
        C1C7U.LIZ("StreakInlineMsgModel@79c4.createFakeMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IStreakService.LJJIIZ.getClass();
        Map<Integer, StreakInlineMsgInfo> mapI = C06LY.LIZ().I(this.LL.LIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z2 = false;
        int i2 = 1;
        ?? r10 = 0;
        if (mapI != null) {
            C06YD c06yd = this.LL;
            for (Map.Entry<Integer, StreakInlineMsgInfo> entry : mapI.entrySet()) {
                StreakInlineMsgInfo value = entry.getValue();
                if (value == null) {
                    linkedHashMap.put(entry.getKey(), z2);
                } else if (entry.getKey().intValue() == i2 && (iStreakService = (IStreakService) PluggableExtentionKt.pluggableSpiForReal(IStreakService.class)) != null && iStreakService.S(c06yd.LIZ) != null) {
                    linkedHashMap.put(entry.getKey(), z2);
                } else {
                    long j = value.sortOrder;
                    if (C879390Yef.LIZ(c06yd.LIZ) == AbstractC1711506n3.LIZIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int iIntValue = entry.getKey().intValue();
                    int i3 = 2131832090;
                    if (iIntValue != i2) {
                        if (iIntValue != 2) {
                            string = C2213981Bky.LIZIZ.getApplicationContext().getString(2131832090);
                        } else {
                            IStreakService.LJJIIZ.getClass();
                            int iC = C06LY.LIZ().C(c06yd.LIZ, r10);
                            Resources resources = C2213981Bky.LIZIZ.getApplicationContext().getResources();
                            Object[] objArr = new Object[2];
                            objArr[r10] = "{s_fireIcon}";
                            objArr[i2] = C2286608xc.LJ(iC);
                            string = resources.getQuantityString(2131755263, iC, objArr);
                        }
                    } else {
                        if (z) {
                            i3 = 2131831527;
                        }
                        Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
                        Object[] objArr2 = new Object[i2];
                        objArr2[r10] = "{s_fireIcon}";
                        string = applicationContext.getString(i3, objArr2);
                    }
                    int iLJJJ = a0.LJJJ(string, "{s_fireIcon}", r10, r10, 6);
                    if (iLJJJ >= 0 && (i = iLJJJ + 12) < string.length() && string.charAt(i) == ' ') {
                        string = a0.LJJJJZI(i, i + 1, string).toString();
                    }
                    FakeInlineMessageContent fakeInlineMessageContent = new FakeInlineMessageContent(j, 26, "{s_fireIcon}", string, "");
                    FakeMessage.Builder builder = new FakeMessage.Builder();
                    builder.setFakeContent(fakeInlineMessageContent);
                    builder.msgType(4013);
                    builder.orderIndex(j);
                    C869590Y9l c869590Y9lBuild = builder.build();
                    c869590Y9lBuild.setConversationId(c06yd.LIZ);
                    c869590Y9lBuild.getLocalExt().put("streak_inline_type", String.valueOf(entry.getKey().intValue()));
                    linkedHashMap.put(entry.getKey(), c869590Y9lBuild);
                }
                z2 = false;
                i2 = 1;
                r10 = 0;
            }
        }
        C06YD c06yd2 = this.LL;
        c06yd2.getClass();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            FakeMessage fakeMessage = (FakeMessage) entry2.getValue();
            if (fakeMessage != null) {
                FakeMessage fakeMessage2 = c06yd2.LIZJ.get(entry2.getKey());
                if (fakeMessage2 == null) {
                    c06yd2.LIZJ.put((Integer) entry2.getKey(), fakeMessage);
                    C1DW6 c1dw6 = c06yd2.LJIIIZ;
                    if (c1dw6 != null) {
                        c1dw6.Jk((C869590Y9l) entry2.getValue(), C0YIF.LIZ);
                    }
                } else if (fakeMessage.needUpdate(fakeMessage2)) {
                    c06yd2.LIZJ.put((Integer) entry2.getKey(), fakeMessage);
                    C1DW6 c1dw62 = c06yd2.LJIIIZ;
                    if (c1dw62 != null) {
                        c1dw62.gb(new C0Y3I("streak inline message"), C1697810uHb.LJIILJJIL(fakeMessage), null, -1);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineMsgModel@79c4.createFakeMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
