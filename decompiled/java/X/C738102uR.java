package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02uR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C738102uR extends Message<C738102uR, C738202uS> {
    public static final ProtoAdapter<C738102uR> ADAPTER = new ProtoAdapter<C738102uR>() { // from class: X.02uQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C738102uR decode(ProtoReader protoReader) {
            C738102uR c738102uR = new C738102uR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c738102uR.stickerContent = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c738102uR.micPermissionOn = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c738102uR.invitedToDuetUserIds.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c738102uR;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C738102uR c738102uR) {
            C738102uR c738102uR2 = c738102uR;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c738102uR2.invitedToDuetUserIds) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c738102uR2.micPermissionOn) + protoAdapter.encodedSizeWithTag(3, c738102uR2.stickerContent) + c738102uR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C738102uR c738102uR) {
            C738102uR c738102uR2 = c738102uR;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c738102uR2.invitedToDuetUserIds);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c738102uR2.micPermissionOn);
            protoAdapter.encodeWithTag(protoWriter, 3, c738102uR2.stickerContent);
            protoWriter.writeBytes(c738102uR2.unknownFields());
        }
    };
    public List<String> invitedToDuetUserIds;
    public Boolean micPermissionOn;
    public String stickerContent;

    public C738102uR() {
        super(ADAPTER, ByteString.EMPTY);
        this.invitedToDuetUserIds = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C738202uS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
