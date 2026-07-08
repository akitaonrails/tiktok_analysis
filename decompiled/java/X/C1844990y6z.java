package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0y6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844990y6z extends AbstractC1845010y71 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        List<InterfaceC1845020y72> items = ((InterfaceC1845000y70) xBaseParamModel).getItems();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(items, 10));
        for (InterfaceC1845020y72 interfaceC1845020y72 : items) {
            C1247530iZL c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZ = interfaceC1845020y72.getTitle();
            c1247530iZL.LJI = new AwS606S0100000_27(interfaceC1845020y72, 646);
            c1247530iZL.LIZ(new AwS393S0200000_27(completionBlock, (CompletionBlock<InterfaceC1845030y73>) interfaceC1845020y72, (InterfaceC1845020y72) 176));
            arrayList.add(c1247530iZL);
        }
        C1247530iZL[] c1247530iZLArr = (C1247530iZL[]) arrayList.toArray(new C1247530iZL[0]);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LIZ((C1247530iZL[]) Arrays.copyOf(c1247530iZLArr, c1247530iZLArr.length));
            c1390850mIV.LIZ.LLILLJJLI = new DialogInterfaceOnDismissListenerC1864750ycr(completionBlock, 8);
            c1390850mIV.LIZJ().show(supportFragmentManager, getName());
        }
    }
}
