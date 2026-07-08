package X;

import android.content.Context;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19732412Ig extends C09AY implements InterfaceC1631620sYq<String, Boolean, String, Unit> {
    public final /* synthetic */ C19732312If LL;
    public final /* synthetic */ C19733412Iq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19732412Ig(C19732312If c19732312If, C19733412Iq c19733412Iq) {
        super(3);
        this.LL = c19732312If;
        this.LLILLJJLI = c19733412Iq;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Boolean bool, String str2) {
        InterfaceC19731912Ib interfaceC19731912Ib;
        String str3 = str;
        boolean zBooleanValue = bool.booleanValue();
        this.LL.LIZLLL.LIZ.me(str3, zBooleanValue);
        if (!zBooleanValue) {
            Iterator<ComposerBeauty> it2 = this.LLILLJJLI.LLILZ.iterator();
            while (it2.hasNext()) {
                it2.next().setSelected(false);
            }
            this.LL.LIZLLL.LIZ(false);
            Function2<Context, String, Unit> beautyDmtToast = BeautyContext.INSTANCE.getBeautyDmtToast();
            if (beautyDmtToast != null) {
                Context context = this.LL.LIZ;
                beautyDmtToast.invoke(context, context.getString(0));
            }
        }
        C12JF c12jf = (C12JF) this.LL.LIZLLL.LJ.LIZ(C12JF.class);
        if (c12jf != null) {
            c12jf.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSwitchStatus categoryId = ");
        sbLIZ.append(str3);
        sbLIZ.append(",value = ");
        sbLIZ.append(zBooleanValue);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        C19732312If c19732312If = this.LL;
        Map<BeautyCategory, List<ComposerBeauty>> map = c19732312If.LJIIZILJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (Intrinsics.LJFF(((BeautyCategory) entry.getKey()).getCategoryResponse().getId(), str3)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List list = (List) C13LP.LJJJLIIL(linkedHashMap.values());
        ArrayList<ComposerBeauty> arrayList = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((ComposerBeauty) obj).getExtra().isNone()) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AwS115S0110000_29 awS115S0110000_29 = new AwS115S0110000_29((Map) linkedHashMap2, (Map<ComposerBeauty, Float>) zBooleanValue, true);
        if (arrayList != null) {
            for (ComposerBeauty composerBeauty : arrayList) {
                if (composerBeauty.isCollectionType()) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it3 = childList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                ComposerBeauty next = it3.next();
                                ComposerBeauty composerBeauty2 = next;
                                if (composerBeauty2.getSelected() && !composerBeauty2.getExtra().isNone()) {
                                    if (next != null) {
                                        awS115S0110000_29.invoke(next);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    awS115S0110000_29.invoke(composerBeauty);
                }
            }
        }
        C12JF c12jf2 = (C12JF) c19732312If.LIZLLL.LJ.LIZ(C12JF.class);
        if (c12jf2 != null) {
            c12jf2.LIZIZ(linkedHashMap2);
        }
        C12JP c12jp = this.LL.LIZLLL.LIZLLL;
        if (c12jp != null && (interfaceC19731912Ib = c12jp.LIZ) != null) {
            interfaceC19731912Ib.LJIIIIZZ();
        }
        return Unit.LIZ;
    }
}
