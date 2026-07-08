package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Mr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581280Mr0 extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(2);
    public final int $t;

    public static C581280Mr0 get$arr$(int i) {
        C581280Mr0 c581280Mr0 = (C581280Mr0) arr$.get(i);
        if (c581280Mr0 != null) {
            return c581280Mr0;
        }
        arr$.compareAndSet(i, null, new C581280Mr0(i));
        return (C581280Mr0) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C581280Mr0(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C581280Mr0 c581280Mr0, Object obj, Object obj2, Object obj3, Object obj4) {
        ((ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class)).LIZJ((String) obj, (Integer) obj2, (String) obj3, (String) obj4);
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$1(C581280Mr0 c581280Mr0, Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        Throwable th = (Throwable) obj4;
        switch (str.hashCode()) {
            case 2251950:
                if (str.equals("INFO")) {
                    C201955140j.LJIILL(C542840LQs.LIZIZ, str2, str3);
                }
                break;
            case 2656902:
                if (str.equals("WARN")) {
                    C201955140j.LJIJJ(C542840LQs.LIZIZ, str2, str3);
                }
                break;
            case 64921139:
                if (str.equals("DEBUG")) {
                    C201955140j.LIZLLL(C542840LQs.LIZIZ, str2, str3);
                }
                break;
            case 66247144:
                if (str.equals("ERROR")) {
                    C537680L6w.LIZ(C542840LQs.LIZIZ, str2, str3, th);
                }
                break;
        }
        return Unit.LIZ;
    }
}
