package X;

import android.view.TouchDelegate;
import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.hotspot.FeedHotspotMonitorSettingConfig;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AwS410S0200000_9;

/* JADX INFO: renamed from: X.0RbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698920RbG {
    public final View LIZ;

    public C698920RbG(View view) {
        this.LIZ = view;
    }

    public final void LIZ(View view) {
        C698930RbH c698930RbH;
        AbstractC700550Rdt abstractC700550Rdt;
        if (!(this.LIZ.getTouchDelegate() instanceof C698930RbH)) {
            this.LIZ.setTouchDelegate(new C698930RbH(this.LIZ, new C698910RbF()));
        }
        TouchDelegate touchDelegate = this.LIZ.getTouchDelegate();
        if ((touchDelegate instanceof C698930RbH) && (c698930RbH = (C698930RbH) touchDelegate) != null) {
            Object tag = view.getTag(R.id.el1);
            if ((tag instanceof C700540Rds) && (abstractC700550Rdt = (AbstractC700550Rdt) tag) != null) {
                c698930RbH.LIZ(abstractC700550Rdt);
            }
            C700540Rds c700540Rds = new C700540Rds(view, this.LIZ, new C632810Orv(this, view));
            c698930RbH.LIZIZ.LIZ(c700540Rds);
            view.setTag(R.id.el1, c700540Rds);
        }
    }

    public final void LIZJ(View view) {
        C698930RbH c698930RbH;
        AbstractC700550Rdt abstractC700550Rdt;
        if (!(this.LIZ.getTouchDelegate() instanceof C698930RbH)) {
            this.LIZ.setTouchDelegate(new C698930RbH(this.LIZ, new C698910RbF()));
        }
        TouchDelegate touchDelegate = this.LIZ.getTouchDelegate();
        if ((touchDelegate instanceof C698930RbH) && (c698930RbH = (C698930RbH) touchDelegate) != null) {
            Object tag = view.getTag(R.id.el1);
            if ((tag instanceof AbstractC700550Rdt) && (abstractC700550Rdt = (AbstractC700550Rdt) tag) != null) {
                c698930RbH.LIZ(abstractC700550Rdt);
            }
            C700520Rdq c700520Rdq = new C700520Rdq(view, this.LIZ, new AwS410S0200000_9(this, view, 69));
            c698930RbH.LIZIZ.LIZ(c700520Rdq);
            view.setTag(R.id.el1, c700520Rdq);
        }
    }

    public final void LIZLLL(View view) {
        C698930RbH c698930RbH;
        if (view == null) {
            return;
        }
        Object tag = view.getTag(R.id.el1);
        if (tag != null) {
            view.setTag(R.id.el1, null);
        }
        if (tag instanceof AbstractC700550Rdt) {
            TouchDelegate touchDelegate = this.LIZ.getTouchDelegate();
            if ((touchDelegate instanceof C698930RbH) && (c698930RbH = (C698930RbH) touchDelegate) != null) {
                c698930RbH.LIZ((AbstractC700550Rdt) tag);
            }
        }
    }

    public final void LIZIZ(View view, InterfaceC698960RbK interfaceC698960RbK) {
        String strLIZIZ;
        C698930RbH c698930RbH;
        AbstractC700550Rdt abstractC700550Rdt;
        Set<String> set;
        if (view != null && interfaceC698960RbK != null && (strLIZIZ = interfaceC698960RbK.LIZIZ()) != null && strLIZIZ.length() != 0) {
            C698940RbI.LIZ.getClass();
            FeedHotspotMonitorSettingConfig feedHotspotMonitorSettingConfig = (FeedHotspotMonitorSettingConfig) C698940RbI.LIZIZ.getValue();
            if (feedHotspotMonitorSettingConfig != null && (set = feedHotspotMonitorSettingConfig.blacklist) != null && C13LP.LJJJJ(interfaceC698960RbK.LIZIZ(), set)) {
                return;
            }
            if (!(this.LIZ.getTouchDelegate() instanceof C698930RbH)) {
                this.LIZ.setTouchDelegate(new C698930RbH(this.LIZ, new C698910RbF()));
            }
            TouchDelegate touchDelegate = this.LIZ.getTouchDelegate();
            if ((touchDelegate instanceof C698930RbH) && (c698930RbH = (C698930RbH) touchDelegate) != null) {
                Object tag = view.getTag(R.id.el1);
                if ((tag instanceof C700530Rdr) && (abstractC700550Rdt = (AbstractC700550Rdt) tag) != null) {
                    c698930RbH.LIZ(abstractC700550Rdt);
                }
                C700530Rdr c700530Rdr = new C700530Rdr(view, interfaceC698960RbK, this.LIZ);
                c698930RbH.LIZIZ.LIZ(c700530Rdr);
                view.setTag(R.id.el1, c700530Rdr);
            }
        }
    }
}
