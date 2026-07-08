package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ydC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864960ydC extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(3);
    public final int $t;

    public static C1864960ydC get$arr$(int i) {
        C1864960ydC c1864960ydC = (C1864960ydC) arr$.get(i);
        if (c1864960ydC != null) {
            return c1864960ydC;
        }
        arr$.compareAndSet(i, null, new C1864960ydC(i));
        return (C1864960ydC) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864960ydC(int i) {
        super(4);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(C1864960ydC c1864960ydC, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1864960ydC c1864960ydC, Object obj, Object obj2, Object obj3, Object obj4) {
        Context context = (Context) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        String str = (String) obj4;
        C1843520y4c.LIZ.getClass();
        if (C1843520y4c.LIZ()) {
            return C1843460y4W.LIZIZ(C1843460y4W.LIZ, context.getString(iIntValue), zBooleanValue, context, str);
        }
        return context.getString(iIntValue);
    }

    public static final Object invoke$2(C1864960ydC c1864960ydC, Object obj, Object obj2, Object obj3, Object obj4) {
        Integer numValueOf;
        Context context = (Context) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        String str = (String) obj4;
        C1843520y4c.LIZ.getClass();
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null && (numValueOf = Integer.valueOf(iPrivacySettingsDepService.LJJI())) != null && numValueOf.intValue() == 2) {
            C1843460y4W c1843460y4W = C1843460y4W.LIZ;
            String string = context.getString(iIntValue);
            c1843460y4W.getClass();
            return C1843460y4W.LIZJ(context, string, str, zBooleanValue);
        }
        return context.getString(iIntValue);
    }
}
