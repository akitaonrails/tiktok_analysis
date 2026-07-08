package com.bytedance.android.btm.api.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class BtmEventConfigModel implements Serializable {

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public int f12switch;

    @C09CT("version")
    public long version;

    @C09CT("bcm_chain_in_logger")
    public BcmChainInLogger reportBcmChain = new BcmChainInLogger();

    @C09CT("logger_backup_add_btm")
    public LoggerBackupAddBtm loggerBackupAddBtm = new LoggerBackupAddBtm();

    public final LoggerBackupAddBtm getLoggerBackupAddBtm() {
        return this.loggerBackupAddBtm;
    }

    public final BcmChainInLogger getReportBcmChain() {
        return this.reportBcmChain;
    }

    public final int getSwitch() {
        return this.f12switch;
    }

    public final long getVersion() {
        return this.version;
    }

    public final void setLoggerBackupAddBtm(LoggerBackupAddBtm loggerBackupAddBtm) {
        this.loggerBackupAddBtm = loggerBackupAddBtm;
    }

    public final void setReportBcmChain(BcmChainInLogger bcmChainInLogger) {
        this.reportBcmChain = bcmChainInLogger;
    }

    public final void setSwitch(int i) {
        this.f12switch = i;
    }

    public final void setVersion(long j) {
        this.version = j;
    }
}
